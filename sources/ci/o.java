package ci;

import org.telegram.messenger.Utilities;
public final class o implements Utilities.Callback {
    public final int f5235a;
    public final ac f5236b;

    public o(ac acVar, int i10) {
        this.f5235a = i10;
        this.f5236b = acVar;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f5235a) {
            case 0:
                int intValue = num.intValue();
                ac acVar = this.f5236b;
                acVar.setPeriod(intValue);
                Utilities.Callback callback = acVar.B1;
                if (callback != null) {
                    callback.run(num);
                    return;
                }
                return;
            default:
                Utilities.Callback callback2 = this.f5236b.C1;
                if (callback2 != null) {
                    callback2.run(num);
                    return;
                }
                return;
        }
    }
}
