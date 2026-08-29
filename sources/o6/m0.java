package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class m0 extends a6.a {
    public static final Parcelable.Creator<m0> CREATOR = new n0(0);
    public final long f19408a;

    public m0(long j10) {
        this.f19408a = Long.valueOf(j10).longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0) || this.f19408a != ((m0) obj).f19408a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f19408a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 8);
        parcel.writeLong(this.f19408a);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
