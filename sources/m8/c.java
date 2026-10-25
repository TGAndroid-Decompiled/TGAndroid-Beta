package m8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import h8.j;
public final class c extends p6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(24);

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
        df.r(parcel, df.q(parcel, 20293));
    }
}
