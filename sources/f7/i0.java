package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
public final class i0 extends r6.a {
    public static final Parcelable.Creator<i0> CREATOR = new db.k(25);
    public final boolean f11390a;

    public i0(boolean z9) {
        this.f11390a = z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0) || this.f11390a != ((i0) obj).f11390a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11390a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f11390a ? 1 : 0);
        wb.s(parcel, r10);
    }
}
