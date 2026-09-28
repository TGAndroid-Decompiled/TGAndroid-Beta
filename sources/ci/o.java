package ci;

import org.telegram.messenger.Utilities;
public final class o implements Utilities.Callback {
    public final int f5225a;
    public final bc f5226b;

    public o(bc bcVar, int i10) {
        this.f5225a = i10;
        this.f5226b = bcVar;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f5225a) {
            case 0:
                int intValue = num.intValue();
                bc bcVar = this.f5226b;
                bcVar.setPeriod(intValue);
                Utilities.Callback callback = bcVar.B1;
                if (callback != null) {
                    callback.run(num);
                    return;
                }
                return;
            default:
                Utilities.Callback callback2 = this.f5226b.C1;
                if (callback2 != null) {
                    callback2.run(num);
                    return;
                }
                return;
        }
    }
}
