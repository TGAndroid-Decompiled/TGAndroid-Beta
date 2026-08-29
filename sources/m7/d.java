package m7;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.o5;
import j7.l1;
import kotlin.jvm.internal.j;
public final class d extends Binder implements b, IInterface {
    public final int f16885a;
    public final TaskCompletionSource f16886b;

    public d(int i10, TaskCompletionSource taskCompletionSource) {
        this.f16885a = i10;
        this.f16886b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    @Override
    public final void i(Status status, x7.d dVar) {
        switch (this.f16885a) {
            case 0:
                return;
            default:
                j.e(status, "status");
                o5.a(status, dVar, this.f16886b);
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
            x7.b bVar = (x7.b) a.a(parcel, x7.b.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                p(status, bVar);
                return true;
            }
            throw new BadParcelableException(l1.k(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
        Status status2 = (Status) a.a(parcel, Status.CREATOR);
        x7.d dVar = (x7.d) a.a(parcel, x7.d.CREATOR);
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 <= 0) {
            i(status2, dVar);
            return true;
        }
        throw new BadParcelableException(l1.k(dataAvail2, "Parcel data not fully consumed, unread size: "));
    }

    @Override
    public final void p(Status status, x7.b bVar) {
        switch (this.f16885a) {
            case 0:
                j.e(status, "status");
                o5.a(status, bVar, this.f16886b);
                return;
            default:
                return;
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    private final void E0(Status status, x7.b bVar) {
    }

    private final void F0(Status status, x7.d dVar) {
    }
}
