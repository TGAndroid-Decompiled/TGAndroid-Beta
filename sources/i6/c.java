package i6;

import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
import java.util.Arrays;
public final class c extends q6.a {
    public static final Parcelable.Creator<c> CREATOR = new c0(14);
    public final String f14623a;

    public c(String str) {
        this.f14623a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return a.d(this.f14623a, ((c) obj).f14623a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14623a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f14623a);
        j8.a.t(parcel, s6);
    }
}
