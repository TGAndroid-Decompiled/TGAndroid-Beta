package h8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class c extends z5.a {
    public static final Parcelable.Creator<c> CREATOR = new h5.h(10);

    public String f8599a;

    public d f8600b;

    public f f8601c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f8599a);
        r8.k(parcel, 3, this.f8600b, i10);
        r8.k(parcel, 5, this.f8601c, i10);
        r8.r(parcel, iQ);
    }
}
