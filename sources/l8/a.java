package l8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.g;
import java.util.Arrays;
import n6.l;
import w7.h0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new g(20);
    public String f11690a;
    public String f11691b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.k(this.f11690a, aVar.f11690a) && l.k(this.f11691b, aVar.f11691b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11690a, this.f11691b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.f11690a);
        h0.l(parcel, 2, this.f11691b);
        h0.r(parcel, q6);
    }
}
