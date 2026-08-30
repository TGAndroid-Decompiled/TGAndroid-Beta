package b7;

import android.os.IBinder;
import android.os.IInterface;
public final class r1 implements IInterface {
    public final IBinder f1725a;
    public final String f1726b;

    public r1(IBinder iBinder, String str) {
        this.f1725a = iBinder;
        this.f1726b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f1725a;
    }
}
