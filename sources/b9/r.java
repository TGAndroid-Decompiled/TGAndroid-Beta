package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new c(15);
    public final int f3019a;
    public final boolean f3020b;
    public final boolean f3021c;

    public r(int i7, boolean z10, boolean z11) {
        this.f3019a = i7;
        this.f3020b = z10;
        this.f3021c = z11;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3019a);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f3020b ? 1 : 0);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f3021c ? 1 : 0);
        cc.s(parcel, r10);
    }
}
