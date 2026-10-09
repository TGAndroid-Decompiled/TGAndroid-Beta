package ci;

import org.telegram.messenger.Utilities;
public final class o implements Utilities.Callback {
    public final int f5656a;
    public final bc f5657b;

    public o(bc bcVar, int i10) {
        this.f5656a = i10;
        this.f5657b = bcVar;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f5656a) {
            case 0:
                int intValue = num.intValue();
                bc bcVar = this.f5657b;
                bcVar.setPeriod(intValue);
                Utilities.Callback callback = bcVar.B1;
                if (callback != null) {
                    callback.run(num);
                    return;
                }
                return;
            default:
                Utilities.Callback callback2 = this.f5657b.C1;
                if (callback2 != null) {
                    callback2.run(num);
                    return;
                }
                return;
        }
    }
}
