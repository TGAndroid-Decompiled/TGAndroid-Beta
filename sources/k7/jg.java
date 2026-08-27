package k7;

import android.os.Parcel;
import android.os.Parcelable;

public final class jg extends z5.a {
    public static final Parcelable.Creator<jg> CREATOR = new cg(3);

    public final boolean f14846a;

    public final boolean f14847b;

    public final boolean f14848c;
    public final boolean d;

    public final boolean f14849e;

    public jg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f14846a = z10;
        this.f14847b = z11;
        this.f14848c = z12;
        this.d = z13;
        this.f14849e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = h7.r8.q(parcel, 20293);
        h7.r8.s(parcel, 1, 4);
        parcel.writeInt(this.f14846a ? 1 : 0);
        h7.r8.s(parcel, 2, 4);
        parcel.writeInt(this.f14847b ? 1 : 0);
        h7.r8.s(parcel, 3, 4);
        parcel.writeInt(this.f14848c ? 1 : 0);
        h7.r8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        h7.r8.s(parcel, 5, 4);
        parcel.writeInt(this.f14849e ? 1 : 0);
        h7.r8.r(parcel, iQ);
    }
}
