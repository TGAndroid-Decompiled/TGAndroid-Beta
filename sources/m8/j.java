package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class j extends c6.a {
    public static final Parcelable.Creator<j> CREATOR = new c(6);
    public final int f13802a;
    public final boolean f13803b;
    public final boolean f13804c;
    public final boolean d;
    public final boolean e;

    public j(int i10, boolean z4, boolean z10, boolean z11, boolean z12) {
        this.f13802a = i10;
        this.f13803b = z4;
        this.f13804c = z10;
        this.d = z11;
        this.e = z12;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f13802a);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13803b ? 1 : 0);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f13804c ? 1 : 0);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        f5.r(parcel, q10);
    }
}
