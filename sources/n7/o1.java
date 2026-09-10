package n7;

import android.os.IBinder;
import android.os.IInterface;
public final class o1 implements IInterface {
    public final IBinder f13985a;
    public final String f13986b;

    public o1(IBinder iBinder, String str) {
        this.f13985a = iBinder;
        this.f13986b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f13985a;
    }
}
