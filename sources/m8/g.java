package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new h(0);
    public final String f16284a;

    public g(String str) {
        this.f16284a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f16284a);
        d0.r(parcel, q6);
    }
}
