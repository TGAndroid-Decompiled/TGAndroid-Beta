package d7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.o5;
public final class f extends c7.a {
    public final int f5434b;
    public final TaskCompletionSource f5435c;

    public f(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 4);
        this.f5434b = i10;
        switch (i10) {
            case 1:
                this.f5435c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", 4);
                return;
            default:
                this.f5435c = taskCompletionSource;
                return;
        }
    }

    @Override
    public final boolean I0(Parcel parcel, int i10) {
        switch (this.f5434b) {
            case 0:
                if (i10 == 1) {
                    d.b(parcel);
                    o5.a((Status) d.a(parcel, Status.CREATOR), (Location) d.a(parcel, Location.CREATOR), this.f5435c);
                    return true;
                }
                return false;
            default:
                if (i10 == 1) {
                    s7.g gVar = (s7.g) d.a(parcel, s7.g.CREATOR);
                    d.b(parcel);
                    Status status = gVar.f47674a;
                    ?? obj = new Object();
                    obj.f306a = gVar;
                    o5.a(status, obj, this.f5435c);
                    return true;
                }
                return false;
        }
    }
}
