package di;

import org.telegram.messenger.Utilities;
public final class o implements Utilities.Callback {
    public final int f7707a;
    public final fc f7708b;

    public o(fc fcVar, int i10) {
        this.f7707a = i10;
        this.f7708b = fcVar;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f7707a) {
            case 0:
                int intValue = num.intValue();
                fc fcVar = this.f7708b;
                fcVar.setPeriod(intValue);
                Utilities.Callback callback = fcVar.B1;
                if (callback != null) {
                    callback.run(num);
                    return;
                }
                return;
            default:
                Utilities.Callback callback2 = this.f7708b.C1;
                if (callback2 != null) {
                    callback2.run(num);
                    return;
                }
                return;
        }
    }
}
