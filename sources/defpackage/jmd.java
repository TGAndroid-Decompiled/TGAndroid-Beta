package defpackage;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class jmd extends e1d {
    public final byte b;
    public final TaskCompletionSource c;

    public jmd(TaskCompletionSource taskCompletionSource, byte b) {
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
                sid.b(parcel);
                fxe.a((Status) sid.a(parcel, Status.CREATOR), (Location) sid.a(parcel, Location.CREATOR), taskCompletionSource);
                return true;
            default:
                if (i != 1) {
                    return false;
                }
                kd6 kd6Var = (kd6) sid.a(parcel, kd6.CREATOR);
                sid.b(parcel);
                Status status = kd6Var.a;
                ?? obj = new Object();
                obj.a = kd6Var;
                fxe.a(status, obj, taskCompletionSource);
                return true;
        }
    }
}
