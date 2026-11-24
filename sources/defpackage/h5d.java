package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class h5d implements IInterface {
    public final IBinder a;

    public h5d(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
