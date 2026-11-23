package c8;

import android.os.Parcel;
import android.os.Parcelable;
public final class hg extends r6.a {
    public static final Parcelable.Creator<hg> CREATOR = new ag(3);
    public final boolean f4846a;
    public final boolean f4847b;
    public final boolean f4848c;
    public final boolean d;
    public final boolean f4849e;

    public hg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f4846a = z10;
        this.f4847b = z11;
        this.f4848c = z12;
        this.d = z13;
        this.f4849e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f4846a ? 1 : 0);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f4847b ? 1 : 0);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f4848c ? 1 : 0);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f4849e ? 1 : 0);
        bc.s(parcel, r10);
    }
}
