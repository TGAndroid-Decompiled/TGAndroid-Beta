package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class g7f extends zz4 {
    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        if (queryLocalInterface instanceof p9d) {
            return (p9d) queryLocalInterface;
        }
        return new f1d(iBinder, "com.google.android.gms.cast.internal.ICastService", (byte) 3);
    }

    @Override
    public final o94[] f() {
        return jgd.e;
    }

    @Override
    public final int i() {
        return 12451000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override
    public final String n() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override
    public final boolean x() {
        return true;
    }
}
