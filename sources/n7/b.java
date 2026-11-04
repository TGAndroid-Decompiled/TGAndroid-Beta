package n7;

import android.os.IBinder;
import android.os.IInterface;
import p6.h;
public final class b extends h {
    @Override
    public final int d() {
        return 261200000;
    }

    @Override
    public final IInterface g(IBinder iBinder) {
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
    public final m6.c[] i() {
        return l6.h.f18074b;
    }

    @Override
    public final String n() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override
    public final String o() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }

    @Override
    public final boolean w() {
        return true;
    }
}
