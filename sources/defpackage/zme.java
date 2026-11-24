package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class zme extends xx4 {
    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        if (queryLocalInterface instanceof j5f) {
            return (j5f) queryLocalInterface;
        }
        return new j5f(iBinder);
    }

    @Override
    public final int i() {
        return 11925000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override
    public final String n() {
        return "com.google.android.gms.clearcut.service.START";
    }
}
