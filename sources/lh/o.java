package lh;

import org.telegram.messenger.Utilities;

public final class o implements Utilities.Callback {

    public final int f16461a;

    public final ib f16462b;

    public o(ib ibVar, int i10) {
        this.f16461a = i10;
        this.f16462b = ibVar;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f16461a) {
            case 0:
                int iIntValue = num.intValue();
                ib ibVar = this.f16462b;
                ibVar.setPeriod(iIntValue);
                Utilities.Callback callback = ibVar.f16710x1;
                if (callback != null) {
                    callback.run(num);
                }
                break;
            default:
                Utilities.Callback callback2 = this.f16462b.f16711y1;
                if (callback2 != null) {
                    callback2.run(num);
                }
                break;
        }
    }
}
