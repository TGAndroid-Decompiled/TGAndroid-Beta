package o8;

import android.os.Parcel;
import android.os.Parcelable;
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new n8.g(6);
    public final String f20938a;

    public g(String str) {
        this.f20938a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f20938a);
        j8.a.t(parcel, s6);
    }
}
