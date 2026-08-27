package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class m0 extends z5.a {
    public static final Parcelable.Creator<m0> CREATOR = new h5.h(29);

    public final long f18384a;

    public m0(long j10) {
        this.f18384a = Long.valueOf(j10).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m0) && this.f18384a == ((m0) obj).f18384a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f18384a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 8);
        parcel.writeLong(this.f18384a);
        r8.r(parcel, iQ);
    }
}
