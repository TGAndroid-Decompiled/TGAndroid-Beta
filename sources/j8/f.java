package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new j7.b(19);
    public final boolean f16943a;
    public final boolean f16944b;
    public final boolean f16945c;
    public final boolean d;
    public final boolean f16946e;
    public final boolean f16947f;

    public f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f16943a = z10;
        this.f16944b = z11;
        this.f16945c = z12;
        this.d = z13;
        this.f16946e = z14;
        this.f16947f = z15;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f16943a ? 1 : 0);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f16944b ? 1 : 0);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f16945c ? 1 : 0);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.f16946e ? 1 : 0);
        yb.q(parcel, 6, 4);
        parcel.writeInt(this.f16947f ? 1 : 0);
        yb.s(parcel, r10);
    }
}
