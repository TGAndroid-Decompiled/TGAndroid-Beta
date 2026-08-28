package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class r0 extends y5.a {
    public static final Parcelable.Creator<r0> CREATOR = new p0(2);
    public final int f11029a;
    public final String f11030b;

    public r0(int i9, String str) {
        this.f11029a = i9;
        this.f11030b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11029a);
        p8.l(parcel, 3, this.f11030b);
        p8.r(parcel, q10);
    }
}
