package i6;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class q extends com.google.android.gms.internal.cast.o implements e {
    public final int f14656b;
    public final TaskCompletionSource f14657c;

    public q(int i3, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 0);
        this.f14656b = i3;
        this.f14657c = taskCompletionSource;
    }

    @Override
    public final boolean K0(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            com.google.android.gms.internal.cast.u.b(parcel);
            n0((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }

    @Override
    public final void n0(Bundle bundle) {
        switch (this.f14656b) {
            case 0:
                this.f14657c.setResult(bundle);
                return;
            case 1:
                this.f14657c.setResult(bundle);
                return;
            default:
                this.f14657c.setResult(bundle);
                return;
        }
    }
}
