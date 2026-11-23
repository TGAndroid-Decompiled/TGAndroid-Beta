package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new c(11);
    public final int f3003a;
    public final b f3004b;

    public n(int i7, b bVar) {
        this.f3003a = i7;
        this.f3004b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3003a);
        cc.k(parcel, 3, this.f3004b, i7);
        cc.s(parcel, r10);
    }
}
