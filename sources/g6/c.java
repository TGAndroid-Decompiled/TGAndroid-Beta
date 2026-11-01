package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new e6.p(10);
    public final String f7371a;

    public c(String str) {
        this.f7371a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return a.d(this.f7371a, ((c) obj).f7371a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7371a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f7371a);
        h0.r(parcel, q6);
    }
}
