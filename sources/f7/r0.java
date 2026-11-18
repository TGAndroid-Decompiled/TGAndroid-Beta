package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class r0 extends r6.a {
    public static final Parcelable.Creator<r0> CREATOR = new db.k(21);
    public final String f11562a;

    public r0(String str) {
        this.f11562a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        return q6.m.l(this.f11562a, ((r0) obj).f11562a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11562a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f11562a);
        bc.s(parcel, r10);
    }
}
