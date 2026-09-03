package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class p extends c6.a {
    public static final Parcelable.Creator<p> CREATOR = new c(11);
    public final int f13558a;
    public final b f13559b;

    public p(int i10, b bVar) {
        this.f13558a = i10;
        this.f13559b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13558a);
        g5.k(parcel, 3, this.f13559b, i10);
        g5.r(parcel, q10);
    }
}
