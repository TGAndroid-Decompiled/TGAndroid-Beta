package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
public abstract class an6 extends Binder implements ei5 {
    public static ei5 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof ei5)) {
            return (ei5) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.a = iBinder;
        return obj;
    }
}
