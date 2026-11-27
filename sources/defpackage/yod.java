package defpackage;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class yod extends u3d {
    public final byte b;
    public final TaskCompletionSource c;

    public yod(TaskCompletionSource taskCompletionSource, byte b) {
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
                ild.b(parcel);
                vze.a((Status) ild.a(parcel, Status.CREATOR), (Location) ild.a(parcel, Location.CREATOR), taskCompletionSource);
                return true;
            default:
                if (i != 1) {
                    return false;
                }
                pd6 pd6Var = (pd6) ild.a(parcel, pd6.CREATOR);
                ild.b(parcel);
                Status status = pd6Var.a;
                ?? obj = new Object();
                obj.a = pd6Var;
                vze.a(status, obj, taskCompletionSource);
                return true;
        }
    }
}
