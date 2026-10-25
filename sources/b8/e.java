package b8;

import a8.aa;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.jvm.internal.i;
public final class e extends Binder implements b, IInterface {
    public final int f3676a;
    public final TaskCompletionSource f3677b;

    public e(int i10, TaskCompletionSource taskCompletionSource) {
        this.f3676a = i10;
        this.f3677b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
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
            m8.b bVar = (m8.b) a.a(parcel, m8.b.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                w(status, bVar);
                return true;
            }
            throw new BadParcelableException(ic.a.i(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
        Status status2 = (Status) a.a(parcel, Status.CREATOR);
        m8.d dVar = (m8.d) a.a(parcel, m8.d.CREATOR);
        int dataAvail2 = parcel.dataAvail();
        if (dataAvail2 <= 0) {
            w0(status2, dVar);
            return true;
        }
        throw new BadParcelableException(ic.a.i(dataAvail2, "Parcel data not fully consumed, unread size: "));
    }

    @Override
    public final void w(Status status, m8.b bVar) {
        switch (this.f3676a) {
            case 0:
                i.e(status, "status");
                aa.a(status, bVar, this.f3677b);
                return;
            default:
                return;
        }
    }

    @Override
    public final void w0(Status status, m8.d dVar) {
        switch (this.f3676a) {
            case 0:
                return;
            default:
                i.e(status, "status");
                aa.a(status, dVar, this.f3677b);
                return;
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    private final void F0(Status status, m8.b bVar) {
    }

    private final void G0(Status status, m8.d dVar) {
    }
}
