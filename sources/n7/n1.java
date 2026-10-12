package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f16535a;
    public final String f16536b;

    public n1(IBinder iBinder, String str) {
        this.f16535a = iBinder;
        this.f16536b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f16535a;
    }
}
