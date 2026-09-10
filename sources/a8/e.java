package a8;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.jvm.internal.i;
import v7.f5;
public final class e extends Binder implements b, IInterface {
    public final int f307a;
    public final TaskCompletionSource f308b;

    public e(int i10, TaskCompletionSource taskCompletionSource) {
        this.f307a = i10;
        this.f308b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    @Override
    public final void S(Status status, l8.b bVar) {
        switch (this.f307a) {
            case 0:
                i.e(status, "status");
                f5.a(status, bVar, this.f308b);
                return;
            default:
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
            l8.b bVar = (l8.b) a.a(parcel, l8.b.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                S(status, bVar);
                return true;
            }
            throw new BadParcelableException(hc.b.j(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
        Status status2 = (Status) a.a(parcel, Status.CREATOR);
        l8.d dVar = (l8.d) a.a(parcel, l8.d.CREATOR);
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 <= 0) {
            s(status2, dVar);
            return true;
        }
        throw new BadParcelableException(hc.b.j(dataAvail2, "Parcel data not fully consumed, unread size: "));
    }

    @Override
    public final void s(Status status, l8.d dVar) {
        switch (this.f307a) {
            case 0:
                return;
            default:
                i.e(status, "status");
                f5.a(status, dVar, this.f308b);
                return;
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    private final void G0(Status status, l8.b bVar) {
    }

    private final void H0(Status status, l8.d dVar) {
    }
}
