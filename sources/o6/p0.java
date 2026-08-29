package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class p0 extends a6.a {
    public static final Parcelable.Creator<p0> CREATOR = new n0(3);
    public final String f19414a;

    public p0(String str) {
        z5.l.h(str);
        this.f19414a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        return this.f19414a.equals(((p0) obj).f19414a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19414a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 1, this.f19414a);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
