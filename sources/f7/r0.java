package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
public final class r0 extends r6.a {
    public static final Parcelable.Creator<r0> CREATOR = new db.k(21);
    public final String f11428a;

    public r0(String str) {
        this.f11428a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        return q6.m.k(this.f11428a, ((r0) obj).f11428a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11428a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 1, this.f11428a);
        wb.s(parcel, r10);
    }
}
