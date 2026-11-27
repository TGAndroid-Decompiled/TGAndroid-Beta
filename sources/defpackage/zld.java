package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class zld implements rxd, IInterface {
    public final IBinder a;

    public zld(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
