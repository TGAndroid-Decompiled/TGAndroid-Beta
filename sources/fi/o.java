package fi;

import org.telegram.messenger.Utilities;
public final class o implements Utilities.Callback {
    public final int f11328a;
    public final ib f11329b;

    public o(ib ibVar, int i10) {
        this.f11328a = i10;
        this.f11329b = ibVar;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f11328a) {
            case 0:
                int intValue = num.intValue();
                ib ibVar = this.f11329b;
                ibVar.setPeriod(intValue);
                Utilities.Callback callback = ibVar.B1;
                if (callback != null) {
                    callback.run(num);
                    return;
                }
                return;
            default:
                Utilities.Callback callback2 = this.f11329b.C1;
                if (callback2 != null) {
                    callback2.run(num);
                    return;
                }
                return;
        }
    }
}
