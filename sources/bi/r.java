package bi;

import org.telegram.messenger.Utilities;
public final class r implements Utilities.Callback {
    public final int f3482a;
    public final qd f3483b;

    public r(qd qdVar, int i10) {
        this.f3482a = i10;
        this.f3483b = qdVar;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f3482a) {
            case 0:
                int intValue = num.intValue();
                qd qdVar = this.f3483b;
                qdVar.setPeriod(intValue);
                Utilities.Callback callback = qdVar.B1;
                if (callback != null) {
                    callback.run(num);
                    return;
                }
                return;
            default:
                Utilities.Callback callback2 = this.f3483b.C1;
                if (callback2 != null) {
                    callback2.run(num);
                    return;
                }
                return;
        }
    }
}
