package h8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class h extends z5.a {
    public static final Parcelable.Creator<h> CREATOR = new h5.h(14);

    public String f8613a;

    public String f8614b;

    public f f8615c;
    public g d;

    public g f8616e;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f8613a);
        r8.l(parcel, 3, this.f8614b);
        r8.k(parcel, 4, this.f8615c, i10);
        r8.k(parcel, 5, this.d, i10);
        r8.k(parcel, 6, this.f8616e, i10);
        r8.r(parcel, iQ);
    }
}
