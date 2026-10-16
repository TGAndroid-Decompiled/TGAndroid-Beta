package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f15918a;
    public final String f15919b;

    public n1(IBinder iBinder, String str) {
        this.f15918a = iBinder;
        this.f15919b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f15918a;
    }
}
