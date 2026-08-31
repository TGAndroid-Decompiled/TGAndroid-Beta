package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class d0 extends c6.a {
    public static final Parcelable.Creator<d0> CREATOR = new c(25);
    public final int f13506a;
    public final String f13507b;

    public d0(int i10, String str) {
        this.f13506a = i10;
        this.f13507b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13506a);
        g5.l(parcel, 3, this.f13507b);
        g5.r(parcel, q10);
    }
}
