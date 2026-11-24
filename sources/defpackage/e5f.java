package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class e5f extends xx4 {
    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        if (queryLocalInterface instanceof n7d) {
            return (n7d) queryLocalInterface;
        }
        return new ezc(iBinder, "com.google.android.gms.cast.internal.ICastService", (byte) 3);
    }

    @Override
    public final f84[] f() {
        return ied.e;
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
