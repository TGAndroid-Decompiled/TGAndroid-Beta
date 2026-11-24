package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class r0d implements v0d, IInterface {
    public final IBinder a;

    public r0d(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
