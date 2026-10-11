package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f16832a;
    public final String f16833b;

    public n1(IBinder iBinder, String str) {
        this.f16832a = iBinder;
        this.f16833b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f16832a;
    }
}
