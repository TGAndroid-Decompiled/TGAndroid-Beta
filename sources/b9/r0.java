package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class r0 extends r6.a {
    public static final Parcelable.Creator<r0> CREATOR = new o0(3);
    public final int f3022a;
    public final k f3023b;

    public r0(int i7, k kVar) {
        this.f3022a = i7;
        this.f3023b = kVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3022a);
        cc.k(parcel, 3, this.f3023b, i7);
        cc.s(parcel, r10);
    }
}
