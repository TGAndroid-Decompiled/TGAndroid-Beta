package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new h(0);
    public final String f14973a;

    public g(String str) {
        this.f14973a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f14973a);
        f0.r(parcel, q6);
    }
}
