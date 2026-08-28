package b7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.h5;
public final class h extends a7.a {
    public final int f1559b;
    public final TaskCompletionSource f1560c;

    public h(int i9, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 1);
        this.f1559b = i9;
        switch (i9) {
            case 1:
                this.f1560c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 1);
                return;
            default:
                this.f1560c = taskCompletionSource;
                return;
        }
    }

    @Override
    public final boolean I0(Parcel parcel, int i9) {
        switch (this.f1559b) {
            case 0:
                if (i9 == 1) {
                    f.b(parcel);
                    h5.a((Status) f.a(parcel, Status.CREATOR), (Location) f.a(parcel, Location.CREATOR), this.f1560c);
                    return true;
                }
                return false;
            default:
                if (i9 == 1) {
                    q7.g gVar = (q7.g) f.a(parcel, q7.g.CREATOR);
                    f.b(parcel);
                    Status status = gVar.f46102a;
                    ?? obj = new Object();
                    obj.f108a = gVar;
                    h5.a(status, obj, this.f1560c);
                    return true;
                }
                return false;
        }
    }
}
