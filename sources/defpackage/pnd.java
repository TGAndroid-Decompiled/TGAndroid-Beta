package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public abstract class pnd extends dbd implements btd {
    public static btd asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof btd) {
            return (btd) queryLocalInterface;
        }
        return new ihd(iBinder);
    }
}
