package nh;

import org.telegram.messenger.Utilities;
public final class o implements Utilities.Callback {
    public final int f18205a;
    public final wa f18206b;

    public o(wa waVar, int i10) {
        this.f18205a = i10;
        this.f18206b = waVar;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f18205a) {
            case 0:
                int intValue = num.intValue();
                wa waVar = this.f18206b;
                waVar.setPeriod(intValue);
                Utilities.Callback callback = waVar.f18492x1;
                if (callback != null) {
                    callback.run(num);
                    return;
                }
                return;
            default:
                Utilities.Callback callback2 = this.f18206b.f18493y1;
                if (callback2 != null) {
                    callback2.run(num);
                    return;
                }
                return;
        }
    }
}
