package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f15335a;
    public final String f15336b;

    public n1(IBinder iBinder, String str) {
        this.f15335a = iBinder;
        this.f15336b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f15335a;
    }
}
