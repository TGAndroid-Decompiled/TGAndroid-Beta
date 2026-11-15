package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class r0 extends r6.a {
    public static final Parcelable.Creator<r0> CREATOR = new db.k(21);
    public final String f11242a;

    public r0(String str) {
        this.f11242a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        return q6.m.k(this.f11242a, ((r0) obj).f11242a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11242a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.f11242a);
        yb.s(parcel, r10);
    }
}
