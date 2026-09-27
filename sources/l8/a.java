package l8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import n6.l;
import w7.f0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(21);
    public String f14149a;
    public String f14150b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(this.f14149a, aVar.f14149a) && l.l(this.f14150b, aVar.f14150b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14149a, this.f14150b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f14149a);
        f0.l(parcel, 2, this.f14150b);
        f0.r(parcel, q6);
    }
}
