package g8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new j(1);
    public final boolean f10344a;
    public final boolean f10345b;
    public final boolean f10346c;
    public final boolean d;
    public final boolean f10347e;
    public final boolean f10348f;

    public h(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f10344a = z10;
        this.f10345b = z11;
        this.f10346c = z12;
        this.d = z13;
        this.f10347e = z14;
        this.f10348f = z15;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f10344a ? 1 : 0);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f10345b ? 1 : 0);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f10346c ? 1 : 0);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.f10347e ? 1 : 0);
        g0.s(parcel, 6, 4);
        parcel.writeInt(this.f10348f ? 1 : 0);
        g0.r(parcel, q6);
    }
}
