package g6;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.p5;
public final class f extends a7.c implements d {
    public final int f6973b;
    public final TaskCompletionSource f6974c;

    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 11);
        this.f6973b = i10;
        this.f6974c = taskCompletionSource;
    }

    @Override
    public final boolean F0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return false;
                    }
                    Status status = (Status) y6.a.a(parcel, Status.CREATOR);
                    y6.a.b(parcel);
                    throw new UnsupportedOperationException();
                }
                Status status2 = (Status) y6.a.a(parcel, Status.CREATOR);
                f6.b bVar = (f6.b) y6.a.a(parcel, f6.b.CREATOR);
                y6.a.b(parcel);
                throw new UnsupportedOperationException();
            }
            y6.a.b(parcel);
            S((Status) y6.a.a(parcel, Status.CREATOR), (f6.c) y6.a.a(parcel, f6.c.CREATOR));
            return true;
        }
        y6.a.b(parcel);
        Q((Status) y6.a.a(parcel, Status.CREATOR), (f6.a) y6.a.a(parcel, f6.a.CREATOR));
        return true;
    }

    @Override
    public void Q(Status status, f6.a aVar) {
        switch (this.f6973b) {
            case 0:
                p5.b(status, aVar, this.f6974c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void S(Status status, f6.c cVar) {
        switch (this.f6973b) {
            case 1:
                p5.b(status, cVar, this.f6974c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
