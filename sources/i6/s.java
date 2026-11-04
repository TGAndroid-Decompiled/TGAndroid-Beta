package i6;

import android.os.IBinder;
import android.os.IInterface;
import e6.y;
public final class s extends p6.h {
    @Override
    public final int d() {
        return 12451000;
    }

    @Override
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        if (queryLocalInterface instanceof i) {
            return (i) queryLocalInterface;
        }
        return new b8.a(iBinder, "com.google.android.gms.cast.internal.ICastService", 2);
    }

    @Override
    public final m6.c[] i() {
        return y.f9791e;
    }

    @Override
    public final String n() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override
    public final String o() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override
    public final boolean w() {
        return true;
    }
}
