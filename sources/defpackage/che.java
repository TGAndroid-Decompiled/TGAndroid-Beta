package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class che implements IInterface {
    public final IBinder a;

    public che(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
