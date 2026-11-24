package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class iff extends b4 {
    public static final Parcelable.Creator<iff> CREATOR = new xff((byte) 5);
    public final boolean a;

    public iff(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof iff) && this.a == ((iff) obj).a) {
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
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        jte.s(parcel, r);
    }
}
