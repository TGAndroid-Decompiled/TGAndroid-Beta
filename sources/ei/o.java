package ei;

import org.telegram.messenger.Utilities;
public final class o implements Utilities.Callback {
    public final int f9535a;
    public final lb f9536b;

    public o(lb lbVar, int i10) {
        this.f9535a = i10;
        this.f9536b = lbVar;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f9535a) {
            case 0:
                int intValue = num.intValue();
                lb lbVar = this.f9536b;
                lbVar.setPeriod(intValue);
                Utilities.Callback callback = lbVar.B1;
                if (callback != null) {
                    callback.run(num);
                    return;
                }
                return;
            default:
                Utilities.Callback callback2 = this.f9536b.C1;
                if (callback2 != null) {
                    callback2.run(num);
                    return;
                }
                return;
        }
    }
}
