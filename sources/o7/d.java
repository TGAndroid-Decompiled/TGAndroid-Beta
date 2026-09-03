package o7;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.r5;
import kf.k0;
import kotlin.jvm.internal.j;
public final class d extends Binder implements b, IInterface {
    public final int f16444a;
    public final TaskCompletionSource f16445b;

    public d(int i10, TaskCompletionSource taskCompletionSource) {
        this.f16444a = i10;
        this.f16445b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    @Override
    public final void k(Status status, z7.d dVar) {
        switch (this.f16444a) {
            case 0:
                return;
            default:
                j.e(status, "status");
                r5.a(status, dVar, this.f16445b);
                return;
        }
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 > 16777215) {
            if (super.onTransact(i10, parcel, parcel2, i11)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            Status status = (Status) a.a(parcel, Status.CREATOR);
            z7.b bVar = (z7.b) a.a(parcel, z7.b.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                w0(status, bVar);
                return true;
            }
            throw new BadParcelableException(k0.j(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
        Status status2 = (Status) a.a(parcel, Status.CREATOR);
        z7.d dVar = (z7.d) a.a(parcel, z7.d.CREATOR);
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 <= 0) {
            k(status2, dVar);
            return true;
        }
        throw new BadParcelableException(k0.j(dataAvail2, "Parcel data not fully consumed, unread size: "));
    }

    @Override
    public final void w0(Status status, z7.b bVar) {
        switch (this.f16444a) {
            case 0:
                j.e(status, "status");
                r5.a(status, bVar, this.f16445b);
                return;
            default:
                return;
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    private final void E0(Status status, z7.b bVar) {
    }

    private final void F0(Status status, z7.d dVar) {
    }
}
