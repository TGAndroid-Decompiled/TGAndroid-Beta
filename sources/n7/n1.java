package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f15413a;
    public final String f15414b;

    public n1(IBinder iBinder, String str) {
        this.f15413a = iBinder;
        this.f15414b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f15413a;
    }
}
