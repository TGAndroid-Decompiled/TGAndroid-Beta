package hi;

import org.telegram.messenger.w10;
public final class p implements w10 {
    public final int f15174a;
    public final db f15175b;

    public p(db dbVar, int i7) {
        this.f15174a = i7;
        this.f15175b = dbVar;
    }

    @Override
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f15174a) {
            case 0:
                int intValue = num.intValue();
                db dbVar = this.f15175b;
                dbVar.setPeriod(intValue);
                w10 w10Var = dbVar.B1;
                if (w10Var != null) {
                    w10Var.a(num);
                    return;
                }
                return;
            default:
                w10 w10Var2 = this.f15175b.C1;
                if (w10Var2 != null) {
                    w10Var2.a(num);
                    return;
                }
                return;
        }
    }
}
