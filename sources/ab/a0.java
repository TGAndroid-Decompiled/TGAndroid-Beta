package ab;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class a0 extends r6.a {
    public static final Parcelable.Creator<a0> CREATOR = new w.a(9);
    public final Bundle f902a;
    public a0.f f903b;

    public a0(Bundle bundle) {
        this.f902a = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.b(parcel, 2, this.f902a);
        yb.s(parcel, r10);
    }
}
