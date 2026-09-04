package g6;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class q extends b8.b implements e {
    public final int f10422b;
    public final TaskCompletionSource f10423c;

    public q(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 1);
        this.f10422b = i10;
        this.f10423c = taskCompletionSource;
    }

    @Override
    public final boolean J0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            com.google.android.gms.internal.cast.v.b(parcel);
            k0((Bundle) com.google.android.gms.internal.cast.v.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }

    @Override
    public final void k0(Bundle bundle) {
        switch (this.f10422b) {
            case 0:
                this.f10423c.setResult(bundle);
                return;
            case 1:
                this.f10423c.setResult(bundle);
                return;
            default:
                this.f10423c.setResult(bundle);
                return;
        }
    }
}
