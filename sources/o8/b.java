package o8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import q6.m;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(14);
    public String f20859a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return m.k(this.f20859a, ((b) obj).f20859a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20859a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f20859a);
        xb.s(parcel, r10);
    }
}
