package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class m0 extends q6.a {
    public static final Parcelable.Creator<m0> CREATOR = new w.a(22);
    public final long f9849a;

    public m0(long j10) {
        this.f9849a = Long.valueOf(j10).longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0) || this.f9849a != ((m0) obj).f9849a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9849a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 8);
        parcel.writeLong(this.f9849a);
        j8.a.t(parcel, s6);
    }
}
