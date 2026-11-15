package d8;

import a8.l8;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.jvm.internal.j;
public final class d extends Binder implements b, IInterface {
    public final int f7600a;
    public final TaskCompletionSource f7601b;

    public d(int i7, TaskCompletionSource taskCompletionSource) {
        this.f7600a = i7;
        this.f7601b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    @Override
    public final void F0(Status status, o8.d dVar) {
        switch (this.f7600a) {
            case 0:
                return;
            default:
                j.e(status, "status");
                l8.a(status, dVar, this.f7601b);
                return;
        }
    }

    @Override
    public final void n(Status status, o8.b bVar) {
        switch (this.f7600a) {
            case 0:
                j.e(status, "status");
                l8.a(status, bVar, this.f7601b);
                return;
            default:
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
            throw new BadParcelableException(i5.c.i(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
        Status status2 = (Status) a.a(parcel, Status.CREATOR);
        o8.d dVar = (o8.d) a.a(parcel, o8.d.CREATOR);
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 <= 0) {
            F0(status2, dVar);
            return true;
        }
        throw new BadParcelableException(i5.c.i(dataAvail2, "Parcel data not fully consumed, unread size: "));
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    private final void h1(Status status, o8.b bVar) {
    }

    private final void i1(Status status, o8.d dVar) {
    }
}
