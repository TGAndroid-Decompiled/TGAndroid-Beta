package ab;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class z extends r6.a {
    public static final Parcelable.Creator<z> CREATOR = new w.a(9);
    public final Bundle f1010a;
    public a0.f f1011b;

    public z(Bundle bundle) {
        this.f1010a = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.b(parcel, 2, this.f1010a);
        xb.s(parcel, r10);
    }
}
