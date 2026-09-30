package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f15394a;
    public final String f15395b;

    public n1(IBinder iBinder, String str) {
        this.f15394a = iBinder;
        this.f15395b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f15394a;
    }
}
