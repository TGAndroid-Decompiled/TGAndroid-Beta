package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import f7.t0;
import java.util.Arrays;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new t0(29);
    public final String f17247a;

    public c(String str) {
        this.f17247a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return a.d(this.f17247a, ((c) obj).f17247a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17247a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f17247a);
        bc.s(parcel, r10);
    }
}
