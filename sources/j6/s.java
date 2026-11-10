package j6;

import android.os.IBinder;
import android.os.IInterface;
import f6.y;
public final class s extends q6.h {
    @Override
    public final int d() {
        return 12451000;
    }

    @Override
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        if (queryLocalInterface instanceof i) {
            return (i) queryLocalInterface;
        }
        return new a8.a(iBinder, "com.google.android.gms.cast.internal.ICastService", 2);
    }

    @Override
    public final n6.c[] k() {
        return y.f11353e;
    }

    @Override
    public final String o() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override
    public final String p() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override
    public final boolean x() {
        return true;
    }
}
