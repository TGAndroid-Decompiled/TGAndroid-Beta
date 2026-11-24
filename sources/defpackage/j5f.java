package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class j5f implements IInterface {
    public final IBinder a;

    public j5f(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
