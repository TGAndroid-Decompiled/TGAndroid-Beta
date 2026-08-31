package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class n extends c6.a {
    public static final Parcelable.Creator<n> CREATOR = new c(9);
    public final int f13549a;
    public final int f13550b;

    public n(int i10, int i11) {
        this.f13549a = i10;
        this.f13550b = i11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13549a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f13550b);
        g5.r(parcel, q10);
    }
}
