package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class s0 extends z5.a {
    public static final Parcelable.Creator<s0> CREATOR = new o0(13);

    public final String f18408a;

    public s0(String str) {
        this.f18408a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s0) {
            return y5.l.l(this.f18408a, ((s0) obj).f18408a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18408a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.f18408a);
        r8.r(parcel, iQ);
    }
}
