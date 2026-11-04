package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class s0 extends q6.a {
    public static final Parcelable.Creator<s0> CREATOR = new r0(6);
    public final String f9873a;

    public s0(String str) {
        this.f9873a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        return p6.m.k(this.f9873a, ((s0) obj).f9873a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9873a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.f9873a);
        j8.a.t(parcel, s6);
    }
}
