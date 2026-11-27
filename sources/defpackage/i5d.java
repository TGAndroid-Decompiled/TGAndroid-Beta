package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class i5d implements m5d, IInterface {
    public final IBinder a;

    public i5d(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
