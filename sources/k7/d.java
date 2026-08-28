package k7;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.h5;
import j3.r0;
import kotlin.jvm.internal.i;
public final class d extends Binder implements b, IInterface {
    public final int f14664a;
    public final TaskCompletionSource f14665b;

    public d(int i9, TaskCompletionSource taskCompletionSource) {
        this.f14664a = i9;
        this.f14665b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    @Override
    public final void h(Status status, v7.d dVar) {
        switch (this.f14664a) {
            case 0:
                return;
            default:
                i.e(status, "status");
                h5.a(status, dVar, this.f14665b);
                return;
        }
    }

    @Override
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        if (i9 > 16777215) {
            if (super.onTransact(i9, parcel, parcel2, i10)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        if (i9 != 1) {
            if (i9 != 2) {
                return false;
            }
            Status status = (Status) a.a(parcel, Status.CREATOR);
            v7.b bVar = (v7.b) a.a(parcel, v7.b.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                y(status, bVar);
                return true;
            }
            throw new BadParcelableException(r0.l(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
        Status status2 = (Status) a.a(parcel, Status.CREATOR);
        v7.d dVar = (v7.d) a.a(parcel, v7.d.CREATOR);
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 <= 0) {
            h(status2, dVar);
            return true;
        }
        throw new BadParcelableException(r0.l(dataAvail2, "Parcel data not fully consumed, unread size: "));
    }

    @Override
    public final void y(Status status, v7.b bVar) {
        switch (this.f14664a) {
            case 0:
                i.e(status, "status");
                h5.a(status, bVar, this.f14665b);
                return;
            default:
                return;
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    private final void E0(Status status, v7.b bVar) {
    }

    private final void F0(Status status, v7.d dVar) {
    }
}
