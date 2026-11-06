package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
public final class m0 extends r6.a {
    public static final Parcelable.Creator<m0> CREATOR = new db.k(7);
    public final long f11406a;

    public m0(long j3) {
        this.f11406a = Long.valueOf(j3).longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0) || this.f11406a != ((m0) obj).f11406a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11406a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 8);
        parcel.writeLong(this.f11406a);
        wb.s(parcel, r10);
    }
}
