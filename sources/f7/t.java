package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class t extends r6.a {
    public static final Parcelable.Creator<t> CREATOR = new db.k(9);
    public final boolean f11435a;

    public t(boolean z9) {
        this.f11435a = z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t) || this.f11435a != ((t) obj).f11435a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11435a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f11435a ? 1 : 0);
        xb.s(parcel, r10);
    }
}
