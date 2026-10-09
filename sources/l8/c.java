package l8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.d0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(23);

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        d0.r(parcel, d0.q(parcel, 20293));
    }
}
