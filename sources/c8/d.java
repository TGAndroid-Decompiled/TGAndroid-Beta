package c8;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b8.y9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import k2.p1;
import kotlin.jvm.internal.j;
public final class d extends Binder implements b, IInterface {
    public final int f4240a;
    public final TaskCompletionSource f4241b;

    public d(int i3, TaskCompletionSource taskCompletionSource) {
        this.f4240a = i3;
        this.f4241b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    @Override
    public final void A0(Status status, n8.d dVar) {
        switch (this.f4240a) {
            case 0:
                return;
            default:
                j.e(status, "status");
                y9.a(status, dVar, this.f4241b);
                return;
        }
    }

    @Override
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        if (i3 > 16777215) {
            if (super.onTransact(i3, parcel, parcel2, i10)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        if (i3 != 1) {
            if (i3 != 2) {
                return false;
            }
            Status status = (Status) a.a(parcel, Status.CREATOR);
            n8.b bVar = (n8.b) a.a(parcel, n8.b.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                q(status, bVar);
                return true;
            }
            throw new BadParcelableException(p1.i(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
        Status status2 = (Status) a.a(parcel, Status.CREATOR);
        n8.d dVar = (n8.d) a.a(parcel, n8.d.CREATOR);
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 <= 0) {
            A0(status2, dVar);
            return true;
        }
        throw new BadParcelableException(p1.i(dataAvail2, "Parcel data not fully consumed, unread size: "));
    }

    @Override
    public final void q(Status status, n8.b bVar) {
        switch (this.f4240a) {
            case 0:
                j.e(status, "status");
                y9.a(status, bVar, this.f4241b);
                return;
            default:
                return;
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    private final void H0(Status status, n8.b bVar) {
    }

    private final void I0(Status status, n8.d dVar) {
    }
}
