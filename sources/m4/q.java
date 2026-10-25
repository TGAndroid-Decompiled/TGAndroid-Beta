package m4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
public abstract class q extends Binder implements m {
    public static m F0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof m)) {
            return (m) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f18122a = iBinder;
        return obj;
    }
}
