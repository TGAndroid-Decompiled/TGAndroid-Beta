package j6;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class r extends a8.q implements e {
    public final int f16897b;
    public final TaskCompletionSource f16898c;

    public r(int i7, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 1);
        this.f16897b = i7;
        this.f16898c = taskCompletionSource;
    }

    @Override
    public final boolean k1(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 == 1) {
            com.google.android.gms.internal.cast.t.b(parcel);
            z0((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }

    @Override
    public final void z0(Bundle bundle) {
        switch (this.f16897b) {
            case 0:
                this.f16898c.setResult(bundle);
                return;
            case 1:
                this.f16898c.setResult(bundle);
                return;
            default:
                this.f16898c.setResult(bundle);
                return;
        }
    }
}
