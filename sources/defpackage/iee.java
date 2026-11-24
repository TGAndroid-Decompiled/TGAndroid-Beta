package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class iee implements IInterface {
    public final IBinder a;

    public iee(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
