package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public abstract class spd extends fdd implements evd {
    public static evd asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof evd) {
            return (evd) queryLocalInterface;
        }
        return new jjd(iBinder);
    }
}
