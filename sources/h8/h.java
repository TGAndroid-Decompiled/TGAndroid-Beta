package h8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class h extends p6.a {
    public static final Parcelable.Creator<h> CREATOR = new j(1);
    public final boolean f12708a;
    public final boolean f12709b;
    public final boolean f12710c;
    public final boolean d;
    public final boolean e;
    public final boolean f12711f;

    public h(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f12708a = z10;
        this.f12709b = z11;
        this.f12710c = z12;
        this.d = z13;
        this.e = z14;
        this.f12711f = z15;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f12708a ? 1 : 0);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f12709b ? 1 : 0);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f12710c ? 1 : 0);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        df.s(parcel, 6, 4);
        parcel.writeInt(this.f12711f ? 1 : 0);
        df.r(parcel, q5);
    }
}
