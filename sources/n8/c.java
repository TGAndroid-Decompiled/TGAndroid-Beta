package n8;

import android.os.Parcel;
import android.os.Parcelable;
public final class c extends q6.a {
    public static final Parcelable.Creator<c> CREATOR = new g(0);

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
    public final void writeToParcel(Parcel parcel, int i3) {
        j8.a.t(parcel, j8.a.s(parcel, 20293));
    }
}
