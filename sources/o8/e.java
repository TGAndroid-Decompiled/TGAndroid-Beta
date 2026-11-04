package o8;

import android.os.Parcel;
import android.os.Parcelable;
public final class e extends q6.a {
    public static final Parcelable.Creator<e> CREATOR = new n8.g(3);
    public final String f20934a;

    public e(String str) {
        this.f20934a = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f20934a);
        j8.a.t(parcel, s6);
    }
}
