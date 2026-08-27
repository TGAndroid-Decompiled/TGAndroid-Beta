package m6;

import a7.d;
import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.g5;
import u6.c;
import y6.j;

public final class b extends Binder implements IInterface {

    public final int f17872a;

    public final Object f17873b;

    public b(int i10, TaskCompletionSource taskCompletionSource) {
        this.f17872a = i10;
        switch (i10) {
            case 1:
                this.f17873b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
                break;
            default:
                this.f17873b = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
                break;
        }
    }

    @Override
    public final IBinder asBinder() {
        int i10 = this.f17872a;
        return this;
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (this.f17872a) {
            case 0:
                if (i10 > 16777215) {
                    if (!super.onTransact(i10, parcel, parcel2, i11)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                if (i10 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i12 = j.f49741a;
                Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                PendingIntent pendingIntent = (PendingIntent) (parcel.readInt() != 0 ? (Parcelable) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(i0.a.k(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                g5.a(statusCreateFromParcel, pendingIntent, (TaskCompletionSource) this.f17873b);
                return true;
            case 1:
                if (i10 > 16777215) {
                    if (!super.onTransact(i10, parcel, parcel2, i11)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                if (i10 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator2 = Status.CREATOR;
                int i13 = c.f48427a;
                Status statusCreateFromParcel2 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                int iDataAvail2 = parcel.dataAvail();
                if (iDataAvail2 > 0) {
                    throw new BadParcelableException(i0.a.k(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                }
                g5.a(statusCreateFromParcel2, null, (TaskCompletionSource) this.f17873b);
                return true;
            default:
                if (i10 > 16777215) {
                    if (!super.onTransact(i10, parcel, parcel2, i11)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                if (i10 == 1) {
                    ((y8.c) this.f17873b).a((Status) d.a(parcel, Status.CREATOR));
                } else if (i10 == 2) {
                } else {
                    if (i10 != 4) {
                        return false;
                    }
                }
                return true;
        }
    }

    public b(y8.c cVar) {
        this.f17872a = 2;
        attachInterface(this, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        this.f17873b = cVar;
    }
}
