package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new e6.i(11);
    public final String f8561a;

    public c(String str) {
        this.f8561a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return a.d(this.f8561a, ((c) obj).f8561a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8561a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.f8561a);
        e0.r(parcel, q6);
    }
}
