package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class p0 extends z5.a {
    public static final Parcelable.Creator<p0> CREATOR = new o0(2);

    public final String f18390a;

    public p0(String str) {
        y5.l.h(str);
        this.f18390a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p0) {
            return this.f18390a.equals(((p0) obj).f18390a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18390a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.f18390a);
        r8.r(parcel, iQ);
    }
}
