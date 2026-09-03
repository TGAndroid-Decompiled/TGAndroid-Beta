package n7;

import android.os.Parcel;
import android.os.Parcelable;
public final class kg extends c6.a {
    public static final Parcelable.Creator<kg> CREATOR = new dg(3);
    public final boolean f14626a;
    public final boolean f14627b;
    public final boolean f14628c;
    public final boolean d;
    public final boolean e;

    public kg(boolean z4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f14626a = z4;
        this.f14627b = z10;
        this.f14628c = z11;
        this.d = z12;
        this.e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.f5.q(parcel, 20293);
        j7.f5.s(parcel, 1, 4);
        parcel.writeInt(this.f14626a ? 1 : 0);
        j7.f5.s(parcel, 2, 4);
        parcel.writeInt(this.f14627b ? 1 : 0);
        j7.f5.s(parcel, 3, 4);
        parcel.writeInt(this.f14628c ? 1 : 0);
        j7.f5.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j7.f5.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        j7.f5.r(parcel, q10);
    }
}
