package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class n1 implements IInterface {
    public final IBinder f16693a;
    public final String f16694b;

    public n1(IBinder iBinder, String str) {
        this.f16693a = iBinder;
        this.f16694b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f16693a;
    }
}
