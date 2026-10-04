package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f16809a;
    public final String f16810b;

    public n1(IBinder iBinder, String str) {
        this.f16809a = iBinder;
        this.f16810b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f16809a;
    }
}
