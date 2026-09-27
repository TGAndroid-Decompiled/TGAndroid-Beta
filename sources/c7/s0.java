package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new r0(2);
    public final String f4140a;

    public s0(String str) {
        this.f4140a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        return n6.l.l(this.f4140a, ((s0) obj).f4140a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4140a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f4140a);
        w7.f0.r(parcel, q6);
    }
}
