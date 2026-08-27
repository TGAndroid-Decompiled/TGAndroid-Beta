package d6;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.g5;

public final class f extends b7.a implements d {

    public final int f4865b;

    public final TaskCompletionSource f4866c;

    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 10);
        this.f4865b = i10;
        this.f4866c = taskCompletionSource;
    }

    @Override
    public final boolean F0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            Status status = (Status) v6.a.a(parcel, Status.CREATOR);
            c6.a aVar = (c6.a) v6.a.a(parcel, c6.a.CREATOR);
            v6.a.b(parcel);
            J(status, aVar);
            return true;
        }
        if (i10 == 2) {
            Status status2 = (Status) v6.a.a(parcel, Status.CREATOR);
            c6.c cVar = (c6.c) v6.a.a(parcel, c6.c.CREATOR);
            v6.a.b(parcel);
            d0(status2, cVar);
            return true;
        }
        if (i10 == 3) {
            v6.a.b(parcel);
            throw new UnsupportedOperationException();
        }
        if (i10 != 4) {
            return false;
        }
        v6.a.b(parcel);
        throw new UnsupportedOperationException();
    }

    @Override
    public void J(Status status, c6.a aVar) {
        switch (this.f4865b) {
            case 0:
                g5.b(status, aVar, this.f4866c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void d0(Status status, c6.c cVar) {
        switch (this.f4865b) {
            case 1:
                g5.b(status, cVar, this.f4866c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
