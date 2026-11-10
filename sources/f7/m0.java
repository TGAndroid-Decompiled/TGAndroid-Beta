package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class m0 extends r6.a {
    public static final Parcelable.Creator<m0> CREATOR = new db.k(7);
    public final long f11411a;

    public m0(long j3) {
        this.f11411a = Long.valueOf(j3).longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0) || this.f11411a != ((m0) obj).f11411a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11411a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 8);
        parcel.writeLong(this.f11411a);
        xb.s(parcel, r10);
    }
}
