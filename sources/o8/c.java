package o8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new m6.e(15);

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
    public final void writeToParcel(Parcel parcel, int i7) {
        wb.s(parcel, wb.r(parcel, 20293));
    }
}
