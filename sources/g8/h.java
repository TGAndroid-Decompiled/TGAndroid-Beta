package g8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.c0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new j(1);
    public final boolean f10416a;
    public final boolean f10417b;
    public final boolean f10418c;
    public final boolean d;
    public final boolean f10419e;
    public final boolean f10420f;

    public h(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f10416a = z10;
        this.f10417b = z11;
        this.f10418c = z12;
        this.d = z13;
        this.f10419e = z14;
        this.f10420f = z15;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f10416a ? 1 : 0);
        c0.s(parcel, 2, 4);
        parcel.writeInt(this.f10417b ? 1 : 0);
        c0.s(parcel, 3, 4);
        parcel.writeInt(this.f10418c ? 1 : 0);
        c0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        c0.s(parcel, 5, 4);
        parcel.writeInt(this.f10419e ? 1 : 0);
        c0.s(parcel, 6, 4);
        parcel.writeInt(this.f10420f ? 1 : 0);
        c0.r(parcel, q6);
    }
}
