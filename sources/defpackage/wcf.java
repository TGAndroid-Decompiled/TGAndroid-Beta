package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class wcf implements IInterface {
    public final IBinder a;

    public wcf(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
