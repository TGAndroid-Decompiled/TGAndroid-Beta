package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class xef implements IInterface {
    public final IBinder a;

    public xef(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
