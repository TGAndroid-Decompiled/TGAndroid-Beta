package l8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import n6.l;
import w7.f0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(21);
    public String f14163a;
    public String f14164b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(this.f14163a, aVar.f14163a) && l.l(this.f14164b, aVar.f14164b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14163a, this.f14164b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f14163a);
        f0.l(parcel, 2, this.f14164b);
        f0.r(parcel, q6);
    }
}
