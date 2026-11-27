package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public abstract class gsd extends wfd implements rxd {
    public static rxd asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof rxd) {
            return (rxd) queryLocalInterface;
        }
        return new zld(iBinder);
    }
}
