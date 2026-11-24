package defpackage;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class hkd extends dzc {
    public final byte b;
    public final TaskCompletionSource c;

    public hkd(TaskCompletionSource taskCompletionSource, byte b) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", (byte) 8);
        this.b = b;
        switch (b) {
            case 1:
                this.c = taskCompletionSource;
                super("com.google.android.gms.location.internal.ISettingsCallbacks", (byte) 8);
                return;
            default:
                this.c = taskCompletionSource;
                return;
        }
    }

    @Override
    public final boolean e(Parcel parcel, int i) {
        byte b = this.b;
        TaskCompletionSource taskCompletionSource = this.c;
        switch (b) {
            case 0:
                if (i != 1) {
                    return false;
                }
                rgd.b(parcel);
                dve.a((Status) rgd.a(parcel, Status.CREATOR), (Location) rgd.a(parcel, Location.CREATOR), taskCompletionSource);
                return true;
            default:
                if (i != 1) {
                    return false;
                }
                lb6 lb6Var = (lb6) rgd.a(parcel, lb6.CREATOR);
                rgd.b(parcel);
                Status status = lb6Var.a;
                ?? obj = new Object();
                obj.a = lb6Var;
                dve.a(status, obj, taskCompletionSource);
                return true;
        }
    }
}
