package j7;

import android.os.Parcel;
import android.os.Parcelable;
public final class jg extends y5.a {
    public static final Parcelable.Creator<jg> CREATOR = new cg(3);
    public final boolean f13992a;
    public final boolean f13993b;
    public final boolean f13994c;
    public final boolean d;
    public final boolean f13995e;

    public jg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f13992a = z10;
        this.f13993b = z11;
        this.f13994c = z12;
        this.d = z13;
        this.f13995e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = g7.p8.q(parcel, 20293);
        g7.p8.s(parcel, 1, 4);
        parcel.writeInt(this.f13992a ? 1 : 0);
        g7.p8.s(parcel, 2, 4);
        parcel.writeInt(this.f13993b ? 1 : 0);
        g7.p8.s(parcel, 3, 4);
        parcel.writeInt(this.f13994c ? 1 : 0);
        g7.p8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g7.p8.s(parcel, 5, 4);
        parcel.writeInt(this.f13995e ? 1 : 0);
        g7.p8.r(parcel, q10);
    }
}
