package kh;

import org.telegram.messenger.Utilities;
public final class o implements Utilities.Callback {
    public final int f15782a;
    public final mb f15783b;

    public o(mb mbVar, int i9) {
        this.f15782a = i9;
        this.f15783b = mbVar;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f15782a) {
            case 0:
                int intValue = num.intValue();
                mb mbVar = this.f15783b;
                mbVar.setPeriod(intValue);
                Utilities.Callback callback = mbVar.f16001x1;
                if (callback != null) {
                    callback.run(num);
                    return;
                }
                return;
            default:
                Utilities.Callback callback2 = this.f15783b.f16002y1;
                if (callback2 != null) {
                    callback2.run(num);
                    return;
                }
                return;
        }
    }
}
