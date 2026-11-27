package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
public abstract class ep6 extends Binder implements gk5 {
    public static gk5 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof gk5)) {
            return (gk5) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.a = iBinder;
        return obj;
    }
}
