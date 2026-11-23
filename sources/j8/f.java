package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new j7.b(19);
    public final boolean f17319a;
    public final boolean f17320b;
    public final boolean f17321c;
    public final boolean d;
    public final boolean f17322e;
    public final boolean f17323f;

    public f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f17319a = z10;
        this.f17320b = z11;
        this.f17321c = z12;
        this.d = z13;
        this.f17322e = z14;
        this.f17323f = z15;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f17319a ? 1 : 0);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f17320b ? 1 : 0);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f17321c ? 1 : 0);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.f17322e ? 1 : 0);
        cc.q(parcel, 6, 4);
        parcel.writeInt(this.f17323f ? 1 : 0);
        cc.s(parcel, r10);
    }
}
