package b8;

import android.os.Parcel;
import android.os.Parcelable;
public final class zg extends q6.a {
    public static final Parcelable.Creator<zg> CREATOR = new sg(3);
    public final boolean f3161a;
    public final boolean f3162b;
    public final boolean f3163c;
    public final boolean d;
    public final boolean f3164e;

    public zg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f3161a = z10;
        this.f3162b = z11;
        this.f3163c = z12;
        this.d = z13;
        this.f3164e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f3161a ? 1 : 0);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f3162b ? 1 : 0);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f3163c ? 1 : 0);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.f3164e ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
