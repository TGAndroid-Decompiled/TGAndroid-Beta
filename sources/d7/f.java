package d7;

import android.os.IBinder;
import android.os.IInterface;
public abstract class f extends o7.a implements g {
    public static g asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof g) {
            return (g) queryLocalInterface;
        }
        return new e(iBinder);
    }
}
