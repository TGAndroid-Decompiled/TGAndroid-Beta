package o7;

import android.os.IBinder;
import android.os.IInterface;
import m6.i;
import q6.h;
public final class b extends h {
    @Override
    public final int d() {
        return 261200000;
    }

    @Override
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new c(iBinder);
    }

    @Override
    public final n6.c[] k() {
        return i.f19903b;
    }

    @Override
    public final String o() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override
    public final String p() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }

    @Override
    public final boolean x() {
        return true;
    }
}
