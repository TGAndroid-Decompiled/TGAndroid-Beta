package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class o1 implements IInterface {
    public final IBinder f15165a;
    public final String f15166b;

    public o1(IBinder iBinder, String str) {
        this.f15165a = iBinder;
        this.f15166b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f15165a;
    }
}
