package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class o0 extends y5.a {
    public static final Parcelable.Creator<o0> CREATOR = new p0(0);
    public final int f11017a;
    public final f f11018b;

    public o0(int i9, f fVar) {
        this.f11017a = i9;
        this.f11018b = fVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11017a);
        p8.k(parcel, 3, this.f11018b, i9);
        p8.r(parcel, q10);
    }
}
