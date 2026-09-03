package f7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.p5;
public final class g extends a7.c {
    public final int f6126b;
    public final TaskCompletionSource f6127c;

    public g(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 5);
        this.f6126b = i10;
        switch (i10) {
            case 1:
                this.f6127c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 5);
                return;
            default:
                this.f6127c = taskCompletionSource;
                return;
        }
    }

    @Override
    public final boolean I0(Parcel parcel, int i10) {
        switch (this.f6126b) {
            case 0:
                if (i10 == 1) {
                    e.b(parcel);
                    p5.a((Status) e.a(parcel, Status.CREATOR), (Location) e.a(parcel, Location.CREATOR), this.f6127c);
                    return true;
                }
                return false;
            default:
                if (i10 == 1) {
                    u7.g gVar = (u7.g) e.a(parcel, u7.g.CREATOR);
                    e.b(parcel);
                    Status status = gVar.f48479a;
                    ?? obj = new Object();
                    obj.f2406a = gVar;
                    p5.a(status, obj, this.f6127c);
                    return true;
                }
                return false;
        }
    }
}
