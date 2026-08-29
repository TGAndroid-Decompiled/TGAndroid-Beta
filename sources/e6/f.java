package e6;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.o5;
public final class f extends c7.a implements d {
    public final int f5833b;
    public final TaskCompletionSource f5834c;

    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 10);
        this.f5833b = i10;
        this.f5834c = taskCompletionSource;
    }

    @Override
    public final boolean F0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return false;
                    }
                    Status status = (Status) w6.a.a(parcel, Status.CREATOR);
                    w6.a.b(parcel);
                    throw new UnsupportedOperationException();
                }
                Status status2 = (Status) w6.a.a(parcel, Status.CREATOR);
                d6.b bVar = (d6.b) w6.a.a(parcel, d6.b.CREATOR);
                w6.a.b(parcel);
                throw new UnsupportedOperationException();
            }
            w6.a.b(parcel);
            u((Status) w6.a.a(parcel, Status.CREATOR), (d6.c) w6.a.a(parcel, d6.c.CREATOR));
            return true;
        }
        w6.a.b(parcel);
        f0((Status) w6.a.a(parcel, Status.CREATOR), (d6.a) w6.a.a(parcel, d6.a.CREATOR));
        return true;
    }

    @Override
    public void f0(Status status, d6.a aVar) {
        switch (this.f5833b) {
            case 0:
                o5.b(status, aVar, this.f5834c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void u(Status status, d6.c cVar) {
        switch (this.f5833b) {
            case 1:
                o5.b(status, cVar, this.f5834c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
