package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class qp5 extends c4 {
    public static final Parcelable.Creator<qp5> CREATOR = new g3e((byte) 7);

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof qp5)) {
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
