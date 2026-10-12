package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new e6.i(11);
    public final String f9937a;

    public c(String str) {
        this.f9937a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return a.d(this.f9937a, ((c) obj).f9937a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9937a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f9937a);
        g0.r(parcel, q6);
    }
}
