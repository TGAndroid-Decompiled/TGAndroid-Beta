package g8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new j(1);
    public final boolean f10418a;
    public final boolean f10419b;
    public final boolean f10420c;
    public final boolean d;
    public final boolean f10421e;
    public final boolean f10422f;

    public h(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f10418a = z10;
        this.f10419b = z11;
        this.f10420c = z12;
        this.d = z13;
        this.f10421e = z14;
        this.f10422f = z15;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f10418a ? 1 : 0);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f10419b ? 1 : 0);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f10420c ? 1 : 0);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.f10421e ? 1 : 0);
        d0.s(parcel, 6, 4);
        parcel.writeInt(this.f10422f ? 1 : 0);
        d0.r(parcel, q6);
    }
}
