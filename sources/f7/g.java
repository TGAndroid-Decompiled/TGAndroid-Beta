package f7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.r5;
public final class g extends a7.c {
    public final int f6007b;
    public final TaskCompletionSource f6008c;

    public g(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 5);
        this.f6007b = i10;
        switch (i10) {
            case 1:
                this.f6008c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 5);
                return;
            default:
                this.f6008c = taskCompletionSource;
                return;
        }
    }

    @Override
    public final boolean I0(Parcel parcel, int i10) {
        switch (this.f6007b) {
            case 0:
                if (i10 == 1) {
                    e.b(parcel);
                    r5.a((Status) e.a(parcel, Status.CREATOR), (Location) e.a(parcel, Location.CREATOR), this.f6008c);
                    return true;
                }
                return false;
            default:
                if (i10 == 1) {
                    u7.g gVar = (u7.g) e.a(parcel, u7.g.CREATOR);
                    e.b(parcel);
                    Status status = gVar.f45247a;
                    ?? obj = new Object();
                    obj.f2238a = gVar;
                    r5.a(status, obj, this.f6008c);
                    return true;
                }
                return false;
        }
    }
}
