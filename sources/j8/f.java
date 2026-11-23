package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new j7.b(19);
    public final boolean f17419a;
    public final boolean f17420b;
    public final boolean f17421c;
    public final boolean d;
    public final boolean f17422e;
    public final boolean f17423f;

    public f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f17419a = z10;
        this.f17420b = z11;
        this.f17421c = z12;
        this.d = z13;
        this.f17422e = z14;
        this.f17423f = z15;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f17419a ? 1 : 0);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f17420b ? 1 : 0);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f17421c ? 1 : 0);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.f17422e ? 1 : 0);
        cc.q(parcel, 6, 4);
        parcel.writeInt(this.f17423f ? 1 : 0);
        cc.s(parcel, r10);
    }
}
