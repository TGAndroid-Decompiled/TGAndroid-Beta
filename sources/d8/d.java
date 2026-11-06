package d8;

import a8.k8;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import jg.g;
import kotlin.jvm.internal.j;
public final class d extends Binder implements b, IInterface {
    public final int f8214a;
    public final TaskCompletionSource f8215b;

    public d(int i7, TaskCompletionSource taskCompletionSource) {
        this.f8214a = i7;
        this.f8215b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    @Override
    public final void n(Status status, o8.b bVar) {
        switch (this.f8214a) {
            case 0:
                j.e(status, "status");
                k8.a(status, bVar, this.f8215b);
                return;
            default:
                return;
        }
    }

    @Override
    public final void n0(Status status, o8.d dVar) {
        switch (this.f8214a) {
            case 0:
                return;
            default:
                j.e(status, "status");
                k8.a(status, dVar, this.f8215b);
                return;
        }
    }

    @Override
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 > 16777215) {
            if (super.onTransact(i7, parcel, parcel2, i10)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            Status status = (Status) a.a(parcel, Status.CREATOR);
            o8.b bVar = (o8.b) a.a(parcel, o8.b.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                n(status, bVar);
                return true;
            }
            throw new BadParcelableException(g.j(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
        Status status2 = (Status) a.a(parcel, Status.CREATOR);
        o8.d dVar = (o8.d) a.a(parcel, o8.d.CREATOR);
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 <= 0) {
            n0(status2, dVar);
            return true;
        }
        throw new BadParcelableException(g.j(dataAvail2, "Parcel data not fully consumed, unread size: "));
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    private final void H0(Status status, o8.b bVar) {
    }

    private final void I0(Status status, o8.d dVar) {
    }
}
