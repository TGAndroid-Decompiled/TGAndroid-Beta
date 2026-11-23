package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class r0 extends r6.a {
    public static final Parcelable.Creator<r0> CREATOR = new db.k(21);
    public final String f11553a;

    public r0(String str) {
        this.f11553a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        return q6.m.l(this.f11553a, ((r0) obj).f11553a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11553a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.f11553a);
        cc.s(parcel, r10);
    }
}
