package ei;

import org.telegram.messenger.Utilities;
public final class o implements Utilities.Callback {
    public final int f9537a;
    public final lb f9538b;

    public o(lb lbVar, int i10) {
        this.f9537a = i10;
        this.f9538b = lbVar;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f9537a) {
            case 0:
                int intValue = num.intValue();
                lb lbVar = this.f9538b;
                lbVar.setPeriod(intValue);
                Utilities.Callback callback = lbVar.B1;
                if (callback != null) {
                    callback.run(num);
                    return;
                }
                return;
            default:
                Utilities.Callback callback2 = this.f9538b.C1;
                if (callback2 != null) {
                    callback2.run(num);
                    return;
                }
                return;
        }
    }
}
