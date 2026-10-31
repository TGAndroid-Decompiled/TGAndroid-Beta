package l8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.g;
import w7.h0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new g(23);

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        h0.r(parcel, h0.q(parcel, 20293));
    }
}
