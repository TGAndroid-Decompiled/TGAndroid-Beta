package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f16814a;
    public final String f16815b;

    public n1(IBinder iBinder, String str) {
        this.f16814a = iBinder;
        this.f16815b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f16814a;
    }
}
