package j6;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class s extends a8.q implements e {
    public final int f17373b;
    public final TaskCompletionSource f17374c;

    public s(int i7, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 1);
        this.f17373b = i7;
        this.f17374c = taskCompletionSource;
    }

    @Override
    public final boolean k1(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 == 1) {
            com.google.android.gms.internal.cast.t.b(parcel);
            y0((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }

    @Override
    public final void y0(Bundle bundle) {
        switch (this.f17373b) {
            case 0:
                this.f17374c.setResult(bundle);
                return;
            case 1:
                this.f17374c.setResult(bundle);
                return;
            default:
                this.f17374c.setResult(bundle);
                return;
        }
    }
}
