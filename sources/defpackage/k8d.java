package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class k8d extends zz4 {
    @Override
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (queryLocalInterface instanceof j7d) {
            return (j7d) queryLocalInterface;
        }
        return new j7d(iBinder);
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
