package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new c(11);
    public final int f3002a;
    public final b f3003b;

    public n(int i7, b bVar) {
        this.f3002a = i7;
        this.f3003b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3002a);
        cc.k(parcel, 3, this.f3003b, i7);
        cc.s(parcel, r10);
    }
}
