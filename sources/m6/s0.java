package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class s0 extends y5.a {
    public static final Parcelable.Creator<s0> CREATOR = new r0(2);
    public final String f17572a;

    public s0(String str) {
        this.f17572a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        return x5.l.l(this.f17572a, ((s0) obj).f17572a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17572a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.f17572a);
        p8.r(parcel, q10);
    }
}
