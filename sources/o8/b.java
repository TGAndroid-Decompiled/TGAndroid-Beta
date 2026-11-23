package o8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import q6.m;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(14);
    public String f21772a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return m.l(this.f21772a, ((b) obj).f21772a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21772a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f21772a);
        bc.s(parcel, r10);
    }
}
