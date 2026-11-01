package g6;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class q extends b8.b implements e {
    public final int f7401b;
    public final TaskCompletionSource f7402c;

    public q(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 1);
        this.f7401b = i10;
        this.f7402c = taskCompletionSource;
    }

    @Override
    public final boolean K0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            com.google.android.gms.internal.cast.u.b(parcel);
            m0((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }

    @Override
    public final void m0(Bundle bundle) {
        switch (this.f7401b) {
            case 0:
                this.f7402c.setResult(bundle);
                return;
            case 1:
                this.f7402c.setResult(bundle);
                return;
            default:
                this.f7402c.setResult(bundle);
                return;
        }
    }
}
