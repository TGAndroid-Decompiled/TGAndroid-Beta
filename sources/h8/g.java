package h8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class g extends z5.a {
    public static final Parcelable.Creator<g> CREATOR = new h5.h(13);

    public String f8611a;

    public String f8612b;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f8611a);
        r8.l(parcel, 3, this.f8612b);
        r8.r(parcel, iQ);
    }
}
