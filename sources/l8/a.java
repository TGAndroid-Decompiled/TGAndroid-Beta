package l8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import n6.l;
import w7.g0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(21);
    public String f15379a;
    public String f15380b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(this.f15379a, aVar.f15379a) && l.l(this.f15380b, aVar.f15380b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15379a, this.f15380b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f15379a);
        g0.l(parcel, 2, this.f15380b);
        g0.r(parcel, q6);
    }
}
