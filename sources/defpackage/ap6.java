package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
public abstract class ap6 extends Binder implements dk5 {
    public static dk5 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof dk5)) {
            return (dk5) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.a = iBinder;
        return obj;
    }
}
