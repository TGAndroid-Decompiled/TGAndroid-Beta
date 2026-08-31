package b7;

import android.os.IBinder;
import android.os.IInterface;
public final class r1 implements IInterface {
    public final IBinder f1868a;
    public final String f1869b;

    public r1(IBinder iBinder, String str) {
        this.f1868a = iBinder;
        this.f1869b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f1868a;
    }
}
