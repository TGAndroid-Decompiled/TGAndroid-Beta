package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f15363a;
    public final String f15364b;

    public n1(IBinder iBinder, String str) {
        this.f15363a = iBinder;
        this.f15364b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f15363a;
    }
}
