package m4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
public abstract class m extends Binder implements i {
    public static i G0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof i)) {
            return (i) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f15947a = iBinder;
        return obj;
    }
}
