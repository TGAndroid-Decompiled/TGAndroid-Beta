package d7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class l extends c6.a {
    public static final Parcelable.Creator<l> CREATOR = new b9.e(13);
    public final boolean f4248a;

    public l(boolean z4) {
        this.f4248a = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && this.f4248a == ((l) obj).f4248a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f4248a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f4248a ? 1 : 0);
        f5.r(parcel, q10);
    }
}
