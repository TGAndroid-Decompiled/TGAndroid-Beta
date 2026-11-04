package i8;

import android.os.Parcel;
import android.os.Parcelable;
import i7.p;
public final class f extends q6.a {
    public static final Parcelable.Creator<f> CREATOR = new p(4);
    public final boolean f14702a;
    public final boolean f14703b;
    public final boolean f14704c;
    public final boolean d;
    public final boolean f14705e;
    public final boolean f14706f;

    public f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f14702a = z10;
        this.f14703b = z11;
        this.f14704c = z12;
        this.d = z13;
        this.f14705e = z14;
        this.f14706f = z15;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f14702a ? 1 : 0);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f14703b ? 1 : 0);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f14704c ? 1 : 0);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.f14705e ? 1 : 0);
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(this.f14706f ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
