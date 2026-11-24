package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
public abstract class x2d {
    public final byte a;

    public x2d(int i) {
        this.a = i;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void a(Status status);

    public abstract void b(RuntimeException runtimeException);

    public abstract void c(aec aecVar, boolean z);

    public abstract void d(u1d u1dVar);
}
