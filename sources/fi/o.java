package fi;

import org.telegram.messenger.Utilities;
public final class o implements Utilities.Callback {
    public final int f11327a;
    public final ib f11328b;

    public o(ib ibVar, int i10) {
        this.f11327a = i10;
        this.f11328b = ibVar;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f11327a) {
            case 0:
                int intValue = num.intValue();
                ib ibVar = this.f11328b;
                ibVar.setPeriod(intValue);
                Utilities.Callback callback = ibVar.B1;
                if (callback != null) {
                    callback.run(num);
                    return;
                }
                return;
            default:
                Utilities.Callback callback2 = this.f11328b.C1;
                if (callback2 != null) {
                    callback2.run(num);
                    return;
                }
                return;
        }
    }
}
