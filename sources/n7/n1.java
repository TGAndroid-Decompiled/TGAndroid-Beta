package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f16810a;
    public final String f16811b;

    public n1(IBinder iBinder, String str) {
        this.f16810a = iBinder;
        this.f16811b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f16810a;
    }
}
