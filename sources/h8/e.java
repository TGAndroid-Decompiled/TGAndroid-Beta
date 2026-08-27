package h8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class e extends z5.a {
    public static final Parcelable.Creator<e> CREATOR = new h5.h(11);

    public String f8607a;

    public String f8608b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f8607a);
        r8.l(parcel, 3, this.f8608b);
        r8.r(parcel, iQ);
    }
}
