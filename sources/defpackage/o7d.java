package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
public abstract class o7d {
    public final byte a;

    public o7d(int i) {
        this.a = i;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void a(Status status);

    public abstract void b(RuntimeException runtimeException);

    public abstract void c(zhc zhcVar, boolean z);

    public abstract void d(l6d l6dVar);
}
