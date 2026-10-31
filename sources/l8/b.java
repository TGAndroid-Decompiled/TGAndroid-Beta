package l8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.g;
import java.util.Arrays;
import n6.l;
import w7.h0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new g(21);
    public String f11691a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return l.k(this.f11691a, ((b) obj).f11691a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11691a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.f11691a);
        h0.r(parcel, q6);
    }
}
