package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class m0 extends y5.a {
    public static final Parcelable.Creator<m0> CREATOR = new h5.h(18);
    public final long f17548a;

    public m0(long j10) {
        this.f17548a = Long.valueOf(j10).longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0) || this.f17548a != ((m0) obj).f17548a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f17548a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 8);
        parcel.writeLong(this.f17548a);
        p8.r(parcel, q10);
    }
}
