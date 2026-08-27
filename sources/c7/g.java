package c7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.g5;

public final class g extends b7.a {

    public final int f2465b;

    public final TaskCompletionSource f2466c;

    public g(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 1);
        this.f2465b = i10;
        switch (i10) {
            case 1:
                this.f2466c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 1);
                break;
            default:
                this.f2466c = taskCompletionSource;
                break;
        }
    }

    @Override
    public final boolean I0(Parcel parcel, int i10) {
        switch (this.f2465b) {
            case 0:
                if (i10 != 1) {
                    return false;
                }
                Status status = (Status) e.a(parcel, Status.CREATOR);
                Location location = (Location) e.a(parcel, Location.CREATOR);
                e.b(parcel);
                g5.a(status, location, this.f2466c);
                return true;
            default:
                if (i10 != 1) {
                    return false;
                }
                r7.g gVar = (r7.g) e.a(parcel, r7.g.CREATOR);
                e.b(parcel);
                Status status2 = gVar.f46862a;
                r7.f fVar = new r7.f();
                fVar.f2040a = gVar;
                g5.a(status2, fVar, this.f2466c);
                return true;
        }
    }
}
