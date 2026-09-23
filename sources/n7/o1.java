package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class o1 implements IInterface {
    public final IBinder f15130a;
    public final String f15131b;

    public o1(IBinder iBinder, String str) {
        this.f15130a = iBinder;
        this.f15131b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f15130a;
    }
}
