package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class s extends y5.a {
    public static final Parcelable.Creator<s> CREATOR = new c(14);
    public final int f11031a;
    public final boolean f11032b;

    public s(int i9, boolean z10) {
        this.f11031a = i9;
        this.f11032b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11031a);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f11032b ? 1 : 0);
        p8.r(parcel, q10);
    }
}
