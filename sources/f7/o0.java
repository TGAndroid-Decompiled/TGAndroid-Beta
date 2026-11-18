package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class o0 extends r6.a {
    public static final Parcelable.Creator<o0> CREATOR = new db.k(10);
    public final String f11540a;

    public o0(String str) {
        q6.m.h(str);
        this.f11540a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        return this.f11540a.equals(((o0) obj).f11540a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11540a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f11540a);
        bc.s(parcel, r10);
    }
}
