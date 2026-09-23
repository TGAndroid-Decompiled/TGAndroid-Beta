package g8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new j(1);
    public final boolean f9501a;
    public final boolean f9502b;
    public final boolean f9503c;
    public final boolean d;
    public final boolean e;
    public final boolean f9504f;

    public h(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f9501a = z10;
        this.f9502b = z11;
        this.f9503c = z12;
        this.d = z13;
        this.e = z14;
        this.f9504f = z15;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f9501a ? 1 : 0);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f9502b ? 1 : 0);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f9503c ? 1 : 0);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        e0.s(parcel, 6, 4);
        parcel.writeInt(this.f9504f ? 1 : 0);
        e0.r(parcel, q6);
    }
}
