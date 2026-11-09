package c8;

import android.os.Parcel;
import android.os.Parcelable;
public final class hg extends r6.a {
    public static final Parcelable.Creator<hg> CREATOR = new ag(3);
    public final boolean f5705a;
    public final boolean f5706b;
    public final boolean f5707c;
    public final boolean d;
    public final boolean f5708e;

    public hg(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f5705a = z9;
        this.f5706b = z10;
        this.f5707c = z11;
        this.d = z12;
        this.f5708e = z13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f5705a ? 1 : 0);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f5706b ? 1 : 0);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f5707c ? 1 : 0);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.f5708e ? 1 : 0);
        xb.s(parcel, r10);
    }
}
