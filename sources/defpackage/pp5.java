package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class pp5 extends c4 {
    public static final Parcelable.Creator<pp5> CREATOR = new g3e((byte) 0);

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof pp5)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        bye.s(parcel, bye.r(parcel, 20293));
    }
}
