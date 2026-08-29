package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class s0 extends a6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(14);
    public final String f19432a;

    public s0(String str) {
        this.f19432a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        return z5.l.l(this.f19432a, ((s0) obj).f19432a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19432a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 1, this.f19432a);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
