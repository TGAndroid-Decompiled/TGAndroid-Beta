package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import f7.t0;
import java.util.Arrays;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new t0(29);
    public final String f16511a;

    public c(String str) {
        this.f16511a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return a.d(this.f16511a, ((c) obj).f16511a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16511a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f16511a);
        xb.s(parcel, r10);
    }
}
