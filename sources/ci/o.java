package ci;

import org.telegram.messenger.Utilities;
public final class o implements Utilities.Callback {
    public final int f5100a;
    public final ec f5101b;

    public o(ec ecVar, int i10) {
        this.f5100a = i10;
        this.f5101b = ecVar;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f5100a) {
            case 0:
                int intValue = num.intValue();
                ec ecVar = this.f5101b;
                ecVar.setPeriod(intValue);
                Utilities.Callback callback = ecVar.B1;
                if (callback != null) {
                    callback.run(num);
                    return;
                }
                return;
            default:
                Utilities.Callback callback2 = this.f5101b.C1;
                if (callback2 != null) {
                    callback2.run(num);
                    return;
                }
                return;
        }
    }
}
