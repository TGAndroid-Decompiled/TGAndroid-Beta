package g6;

import android.os.IBinder;
import android.os.IInterface;
import c6.y;
public final class s extends n6.g {
    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final int l() {
        return 12451000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        if (queryLocalInterface instanceof i) {
            return (i) queryLocalInterface;
        }
        return new a9.a(iBinder, "com.google.android.gms.cast.internal.ICastService", 1);
    }

    @Override
    public final k6.c[] r() {
        return y.e;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
