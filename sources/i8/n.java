package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class n extends y5.a {
    public static final Parcelable.Creator<n> CREATOR = new c(9);
    public final int f11010a;
    public final int f11011b;

    public n(int i9, int i10) {
        this.f11010a = i9;
        this.f11011b = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11010a);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f11011b);
        p8.r(parcel, q10);
    }
}
