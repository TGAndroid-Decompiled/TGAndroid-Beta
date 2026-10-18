package m4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
public abstract class p extends Binder implements l {
    public static l F0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof l)) {
            return (l) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f16593a = iBinder;
        return obj;
    }
}
