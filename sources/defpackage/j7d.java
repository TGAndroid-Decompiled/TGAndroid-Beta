package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class j7d implements IInterface {
    public final IBinder a;

    public j7d(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
