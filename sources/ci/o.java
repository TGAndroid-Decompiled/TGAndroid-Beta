package ci;

import org.telegram.messenger.Utilities;
public final class o implements Utilities.Callback {
    public final int f5104a;
    public final ec f5105b;

    public o(ec ecVar, int i10) {
        this.f5104a = i10;
        this.f5105b = ecVar;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f5104a) {
            case 0:
                int intValue = num.intValue();
                ec ecVar = this.f5105b;
                ecVar.setPeriod(intValue);
                Utilities.Callback callback = ecVar.B1;
                if (callback != null) {
                    callback.run(num);
                    return;
                }
                return;
            default:
                Utilities.Callback callback2 = this.f5105b.C1;
                if (callback2 != null) {
                    callback2.run(num);
                    return;
                }
                return;
        }
    }
}
