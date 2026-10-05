package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f16819a;
    public final String f16820b;

    public n1(IBinder iBinder, String str) {
        this.f16819a = iBinder;
        this.f16820b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f16819a;
    }
}
