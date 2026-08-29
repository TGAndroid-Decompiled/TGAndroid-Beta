package b7;

import android.os.IBinder;
import android.os.IInterface;
public final class b extends z5.g {
    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final int k() {
        return 12600000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new a(iBinder);
    }

    @Override
    public final String v() {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }
}
