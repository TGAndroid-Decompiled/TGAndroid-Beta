package c6;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.h5;
public final class f extends a7.a implements d {
    public final int f2321b;
    public final TaskCompletionSource f2322c;

    public f(int i9, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 10);
        this.f2321b = i9;
        this.f2322c = taskCompletionSource;
    }

    @Override
    public final boolean F0(int i9, Parcel parcel, Parcel parcel2) {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        return false;
                    }
                    Status status = (Status) u6.a.a(parcel, Status.CREATOR);
                    u6.a.b(parcel);
                    throw new UnsupportedOperationException();
                }
                Status status2 = (Status) u6.a.a(parcel, Status.CREATOR);
                b6.b bVar = (b6.b) u6.a.a(parcel, b6.b.CREATOR);
                u6.a.b(parcel);
                throw new UnsupportedOperationException();
            }
            u6.a.b(parcel);
            i((Status) u6.a.a(parcel, Status.CREATOR), (b6.c) u6.a.a(parcel, b6.c.CREATOR));
            return true;
        }
        u6.a.b(parcel);
        z((Status) u6.a.a(parcel, Status.CREATOR), (b6.a) u6.a.a(parcel, b6.a.CREATOR));
        return true;
    }

    @Override
    public void i(Status status, b6.c cVar) {
        switch (this.f2321b) {
            case 1:
                h5.b(status, cVar, this.f2322c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void z(Status status, b6.a aVar) {
        switch (this.f2321b) {
            case 0:
                h5.b(status, aVar, this.f2322c);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
