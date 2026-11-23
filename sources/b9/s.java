package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(16);
    public final int f3022a;
    public final boolean f3023b;

    public s(int i7, boolean z10) {
        this.f3022a = i7;
        this.f3023b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3022a);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f3023b ? 1 : 0);
        cc.s(parcel, r10);
    }
}
