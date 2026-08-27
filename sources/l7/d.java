package l7;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.g5;
import kotlin.jvm.internal.j;

public final class d extends Binder implements b, IInterface {

    public final int f15446a;

    public final TaskCompletionSource f15447b;

    public d(int i10, TaskCompletionSource taskCompletionSource) {
        this.f15446a = i10;
        this.f15447b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    @Override
    public final void Y(Status status, w7.b bVar) {
        switch (this.f15446a) {
            case 0:
                j.e(status, "status");
                g5.a(status, bVar, this.f15447b);
                break;
        }
    }

    @Override
    public final void b0(Status status, w7.d dVar) {
        switch (this.f15446a) {
            case 0:
                break;
            default:
                j.e(status, "status");
                g5.a(status, dVar, this.f15447b);
                break;
        }
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        if (i10 == 1) {
            Status status = (Status) a.a(parcel, Status.CREATOR);
            w7.d dVar = (w7.d) a.a(parcel, w7.d.CREATOR);
            int iDataAvail = parcel.dataAvail();
            if (iDataAvail > 0) {
                throw new BadParcelableException(i0.a.k(iDataAvail, "Parcel data not fully consumed, unread size: "));
            }
            b0(status, dVar);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        Status status2 = (Status) a.a(parcel, Status.CREATOR);
        w7.b bVar = (w7.b) a.a(parcel, w7.b.CREATOR);
        int iDataAvail2 = parcel.dataAvail();
        if (iDataAvail2 > 0) {
            throw new BadParcelableException(i0.a.k(iDataAvail2, "Parcel data not fully consumed, unread size: "));
        }
        Y(status2, bVar);
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    private final void E0(Status status, w7.b bVar) {
    }

    private final void F0(Status status, w7.d dVar) {
    }
}
