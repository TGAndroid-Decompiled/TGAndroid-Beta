package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class p extends y5.a {
    public static final Parcelable.Creator<p> CREATOR = new c(11);
    public final int f11019a;
    public final b f11020b;

    public p(int i9, b bVar) {
        this.f11019a = i9;
        this.f11020b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11019a);
        p8.k(parcel, 3, this.f11020b, i9);
        p8.r(parcel, q10);
    }
}
