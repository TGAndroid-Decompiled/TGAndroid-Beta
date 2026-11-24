package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class mce implements IInterface {
    public final IBinder a;

    public mce(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
