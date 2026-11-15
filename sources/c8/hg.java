package c8;

import android.os.Parcel;
import android.os.Parcelable;
public final class hg extends r6.a {
    public static final Parcelable.Creator<hg> CREATOR = new ag(3);
    public final boolean f4537a;
    public final boolean f4538b;
    public final boolean f4539c;
    public final boolean d;
    public final boolean f4540e;

    public hg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f4537a = z10;
        this.f4538b = z11;
        this.f4539c = z12;
        this.d = z13;
        this.f4540e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f4537a ? 1 : 0);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f4538b ? 1 : 0);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f4539c ? 1 : 0);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.f4540e ? 1 : 0);
        yb.s(parcel, r10);
    }
}
