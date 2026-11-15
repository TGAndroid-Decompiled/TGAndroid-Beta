package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(16);
    public final int f3059a;
    public final boolean f3060b;

    public s(int i7, boolean z10) {
        this.f3059a = i7;
        this.f3060b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3059a);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f3060b ? 1 : 0);
        yb.s(parcel, r10);
    }
}
