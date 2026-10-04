package l8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import n6.l;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(22);
    public String f15381a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return l.l(this.f15381a, ((b) obj).f15381a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15381a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f15381a);
        g0.r(parcel, q6);
    }
}
