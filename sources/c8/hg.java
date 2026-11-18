package c8;

import android.os.Parcel;
import android.os.Parcelable;
public final class hg extends r6.a {
    public static final Parcelable.Creator<hg> CREATOR = new ag(3);
    public final boolean f4817a;
    public final boolean f4818b;
    public final boolean f4819c;
    public final boolean d;
    public final boolean f4820e;

    public hg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f4817a = z10;
        this.f4818b = z11;
        this.f4819c = z12;
        this.d = z13;
        this.f4820e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f4817a ? 1 : 0);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f4818b ? 1 : 0);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f4819c ? 1 : 0);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f4820e ? 1 : 0);
        bc.s(parcel, r10);
    }
}
