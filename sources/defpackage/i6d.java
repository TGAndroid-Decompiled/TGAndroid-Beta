package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class i6d extends xx4 {
    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (queryLocalInterface instanceof h5d) {
            return (h5d) queryLocalInterface;
        }
        return new h5d(iBinder);
    }

    @Override
    public final int i() {
        return 12600000;
    }

    @Override
    public final String l() {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    @Override
    public final String n() {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    @Override
    public final boolean x() {
        return true;
    }
}
