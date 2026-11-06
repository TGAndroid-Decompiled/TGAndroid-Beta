package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new c(15);
    public final int f3095a;
    public final boolean f3096b;
    public final boolean f3097c;

    public r(int i7, boolean z9, boolean z10) {
        this.f3095a = i7;
        this.f3096b = z9;
        this.f3097c = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f3095a);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f3096b ? 1 : 0);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f3097c ? 1 : 0);
        xb.s(parcel, r10);
    }
}
