package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f16868a;
    public final String f16869b;

    public n1(IBinder iBinder, String str) {
        this.f16868a = iBinder;
        this.f16869b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f16868a;
    }
}
