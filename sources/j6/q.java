package j6;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class q extends a8.q implements e {
    public final int f16541b;
    public final TaskCompletionSource f16542c;

    public q(int i7, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 1);
        this.f16541b = i7;
        this.f16542c = taskCompletionSource;
    }

    @Override
    public final boolean K0(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 == 1) {
            com.google.android.gms.internal.cast.t.b(parcel);
            h0((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }

    @Override
    public final void h0(Bundle bundle) {
        switch (this.f16541b) {
            case 0:
                this.f16542c.setResult(bundle);
                return;
            case 1:
                this.f16542c.setResult(bundle);
                return;
            default:
                this.f16542c.setResult(bundle);
                return;
        }
    }
}
