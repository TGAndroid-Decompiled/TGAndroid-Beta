package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class m0 extends p6.a {
    public static final Parcelable.Creator<m0> CREATOR = new w.a(19);
    public final long f8207a;

    public m0(long j10) {
        this.f8207a = Long.valueOf(j10).longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0) || this.f8207a != ((m0) obj).f8207a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f8207a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 8);
        parcel.writeLong(this.f8207a);
        df.r(parcel, q5);
    }
}
