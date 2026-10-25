package a8;

import android.os.Parcel;
import android.os.Parcelable;
public final class ch extends p6.a {
    public static final Parcelable.Creator<ch> CREATOR = new vg(3);
    public final boolean f392a;
    public final boolean f393b;
    public final boolean f394c;
    public final boolean d;
    public final boolean e;

    public ch(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f392a = z10;
        this.f393b = z11;
        this.f394c = z12;
        this.d = z13;
        this.e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f392a ? 1 : 0);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f393b ? 1 : 0);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f394c ? 1 : 0);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        df.r(parcel, q5);
    }
}
