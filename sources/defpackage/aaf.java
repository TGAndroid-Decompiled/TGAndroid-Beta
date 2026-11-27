package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class aaf implements IInterface {
    public final IBinder a;

    public aaf(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
