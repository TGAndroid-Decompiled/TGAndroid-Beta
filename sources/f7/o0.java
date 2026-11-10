package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class o0 extends r6.a {
    public static final Parcelable.Creator<o0> CREATOR = new db.k(10);
    public final String f11414a;

    public o0(String str) {
        q6.m.g(str);
        this.f11414a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        return this.f11414a.equals(((o0) obj).f11414a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11414a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f11414a);
        xb.s(parcel, r10);
    }
}
