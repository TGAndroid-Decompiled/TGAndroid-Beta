package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f17301a;
    public final String f17302b;

    public n1(IBinder iBinder, String str) {
        this.f17301a = iBinder;
        this.f17302b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f17301a;
    }
}
