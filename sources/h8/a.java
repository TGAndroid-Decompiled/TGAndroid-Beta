package h8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class a extends z5.a {
    public static final Parcelable.Creator<a> CREATOR = new h5.h(7);

    public String f8594a;

    public String f8595b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f8594a);
        r8.l(parcel, 3, this.f8595b);
        r8.r(parcel, iQ);
    }
}
