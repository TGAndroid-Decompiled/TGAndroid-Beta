package b7;

import android.os.IBinder;
import android.os.IInterface;
public final class r1 implements IInterface {
    public final IBinder f1736a;
    public final String f1737b;

    public r1(IBinder iBinder, String str) {
        this.f1736a = iBinder;
        this.f1737b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f1736a;
    }
}
