package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class s0 extends y5.a {
    public static final Parcelable.Creator<s0> CREATOR = new p0(3);
    public final int f11033a;
    public final m f11034b;

    public s0(int i9, m mVar) {
        this.f11033a = i9;
        this.f11034b = mVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11033a);
        p8.k(parcel, 3, this.f11034b, i9);
        p8.r(parcel, q10);
    }
}
