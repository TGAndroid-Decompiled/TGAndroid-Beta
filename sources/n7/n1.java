package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f15378a;
    public final String f15379b;

    public n1(IBinder iBinder, String str) {
        this.f15378a = iBinder;
        this.f15379b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f15378a;
    }
}
