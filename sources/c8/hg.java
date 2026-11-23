package c8;

import android.os.Parcel;
import android.os.Parcelable;
public final class hg extends r6.a {
    public static final Parcelable.Creator<hg> CREATOR = new ag(3);
    public final boolean f4811a;
    public final boolean f4812b;
    public final boolean f4813c;
    public final boolean d;
    public final boolean f4814e;

    public hg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f4811a = z10;
        this.f4812b = z11;
        this.f4813c = z12;
        this.d = z13;
        this.f4814e = z14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f4811a ? 1 : 0);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f4812b ? 1 : 0);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f4813c ? 1 : 0);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.f4814e ? 1 : 0);
        cc.s(parcel, r10);
    }
}
