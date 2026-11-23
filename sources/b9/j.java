package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f2984a;
    public final boolean f2985b;
    public final boolean f2986c;
    public final boolean d;
    public final boolean f2987e;

    public j(int i7, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f2984a = i7;
        this.f2985b = z10;
        this.f2986c = z11;
        this.d = z12;
        this.f2987e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f2984a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f2985b ? 1 : 0);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f2986c ? 1 : 0);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.f2987e ? 1 : 0);
        cc.s(parcel, r10);
    }
}
