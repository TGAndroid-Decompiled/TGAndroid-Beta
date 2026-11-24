package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class dpd extends zz4 {
    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        if (queryLocalInterface instanceof fvd) {
            return (fvd) queryLocalInterface;
        }
        return new fvd(iBinder);
    }

    @Override
    public final o94[] f() {
        return pjd.b;
    }

    @Override
    public final int i() {
        return 261200000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override
    public final String n() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }

    @Override
    public final boolean x() {
        return true;
    }
}
