package h6;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class q extends c8.b implements e {
    public final int f12654b;
    public final TaskCompletionSource f12655c;

    public q(int i10, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 1);
        this.f12654b = i10;
        this.f12655c = taskCompletionSource;
    }

    @Override
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            com.google.android.gms.internal.cast.t.b(parcel);
            j0((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }

    @Override
    public final void j0(Bundle bundle) {
        switch (this.f12654b) {
            case 0:
                this.f12655c.setResult(bundle);
                return;
            case 1:
                this.f12655c.setResult(bundle);
                return;
            default:
                this.f12655c.setResult(bundle);
                return;
        }
    }
}
