package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class m0 extends o6.a {
    public static final Parcelable.Creator<m0> CREATOR = new w.a(18);
    public final long f4452a;

    public m0(long j3) {
        this.f4452a = Long.valueOf(j3).longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0) || this.f4452a != ((m0) obj).f4452a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4452a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 8);
        parcel.writeLong(this.f4452a);
        w7.g0.r(parcel, q6);
    }
}
