package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(16);
    public final int f3024a;
    public final boolean f3025b;

    public s(int i7, boolean z10) {
        this.f3024a = i7;
        this.f3025b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3024a);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f3025b ? 1 : 0);
        cc.s(parcel, r10);
    }
}
