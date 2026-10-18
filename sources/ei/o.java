package ei;

import org.telegram.messenger.Utilities;
public final class o implements Utilities.Callback {
    public final int f9536a;
    public final lb f9537b;

    public o(lb lbVar, int i10) {
        this.f9536a = i10;
        this.f9537b = lbVar;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f9536a) {
            case 0:
                int intValue = num.intValue();
                lb lbVar = this.f9537b;
                lbVar.setPeriod(intValue);
                Utilities.Callback callback = lbVar.B1;
                if (callback != null) {
                    callback.run(num);
                    return;
                }
                return;
            default:
                Utilities.Callback callback2 = this.f9537b.C1;
                if (callback2 != null) {
                    callback2.run(num);
                    return;
                }
                return;
        }
    }
}
