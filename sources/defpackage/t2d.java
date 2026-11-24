package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class t2d implements x2d, IInterface {
    public final IBinder a;

    public t2d(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
