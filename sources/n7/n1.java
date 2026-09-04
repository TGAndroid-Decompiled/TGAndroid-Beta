package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f16666a;
    public final String f16667b;

    public n1(IBinder iBinder, String str) {
        this.f16666a = iBinder;
        this.f16667b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f16666a;
    }
}
