package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class jhf extends b4 {
    public static final Parcelable.Creator<jhf> CREATOR = new yhf((byte) 5);
    public final boolean a;

    public jhf(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jhf) && this.a == ((jhf) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        mve.s(parcel, r);
    }
}
