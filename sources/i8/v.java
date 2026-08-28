package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class v extends y5.a {
    public static final Parcelable.Creator<v> CREATOR = new c(17);
    public final int f11044a;
    public final String f11045b;

    public v(int i9, String str) {
        this.f11044a = i9;
        this.f11045b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11044a);
        p8.l(parcel, 3, this.f11045b);
        p8.r(parcel, q10);
    }
}
