package n8;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends q6.a {
    public static final Parcelable.Creator<d> CREATOR = new g(1);

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
    public final void writeToParcel(Parcel parcel, int i3) {
        j8.a.t(parcel, j8.a.s(parcel, 20293));
    }
}
