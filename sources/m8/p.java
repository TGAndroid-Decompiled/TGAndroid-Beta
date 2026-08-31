package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class p extends c6.a {
    public static final Parcelable.Creator<p> CREATOR = new c(11);
    public final int f13556a;
    public final b f13557b;

    public p(int i10, b bVar) {
        this.f13556a = i10;
        this.f13557b = bVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13556a);
        g5.k(parcel, 3, this.f13557b, i10);
        g5.r(parcel, q10);
    }
}
