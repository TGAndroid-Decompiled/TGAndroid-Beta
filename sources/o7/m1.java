package o7;

import android.os.IBinder;
import android.os.IInterface;
public final class m1 implements IInterface {
    public final IBinder f19237a;
    public final String f19238b;

    public m1(IBinder iBinder, String str) {
        this.f19237a = iBinder;
        this.f19238b = str;
    }

    @Override
    public final IBinder asBinder() {
        return this.f19237a;
    }
}
