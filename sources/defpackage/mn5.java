package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class mn5 extends b4 {
    public static final Parcelable.Creator<mn5> CREATOR = new qyd((byte) 0);

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof mn5)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        jte.s(parcel, jte.r(parcel, 20293));
    }
}
