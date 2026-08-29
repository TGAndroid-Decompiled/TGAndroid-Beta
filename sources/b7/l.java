package b7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
public final class l extends a6.a {
    public static final Parcelable.Creator<l> CREATOR = new w.a(22);
    public final boolean f1967a;

    public l(boolean z10) {
        this.f1967a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && this.f1967a == ((l) obj).f1967a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1967a) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.f1967a ? 1 : 0);
        o.r(parcel, q6);
    }
}
