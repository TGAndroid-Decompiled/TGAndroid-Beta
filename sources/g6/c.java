package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.d0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new e6.i(11);
    public final String f10326a;

    public c(String str) {
        this.f10326a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return a.d(this.f10326a, ((c) obj).f10326a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10326a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f10326a);
        d0.r(parcel, q6);
    }
}
