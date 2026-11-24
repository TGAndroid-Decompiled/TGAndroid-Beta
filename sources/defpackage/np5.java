package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class np5 extends b4 {
    public static final Parcelable.Creator<np5> CREATOR = new t0e((byte) 7);

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof np5)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        mve.s(parcel, mve.r(parcel, 20293));
    }
}
