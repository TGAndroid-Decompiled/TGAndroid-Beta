package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f15379a;
    public final String f15380b;

    public n1(IBinder iBinder, String str) {
        this.f15379a = iBinder;
        this.f15380b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f15379a;
    }
}
