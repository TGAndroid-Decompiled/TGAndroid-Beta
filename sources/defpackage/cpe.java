package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class cpe extends zz4 {
    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        if (queryLocalInterface instanceof l7f) {
            return (l7f) queryLocalInterface;
        }
        return new l7f(iBinder);
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
