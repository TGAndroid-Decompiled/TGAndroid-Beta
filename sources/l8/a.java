package l8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import n6.l;
import w7.e0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(21);
    public String f15314a;
    public String f15315b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(this.f15314a, aVar.f15314a) && l.l(this.f15315b, aVar.f15315b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15314a, this.f15315b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f15314a);
        e0.l(parcel, 2, this.f15315b);
        e0.r(parcel, q6);
    }
}
