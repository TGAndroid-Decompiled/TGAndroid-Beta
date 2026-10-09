package l8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import java.util.Arrays;
import n6.l;
import w7.d0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(21);
    public String f15442a;
    public String f15443b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(this.f15442a, aVar.f15442a) && l.l(this.f15443b, aVar.f15443b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15442a, this.f15443b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f15442a);
        d0.l(parcel, 2, this.f15443b);
        d0.r(parcel, q6);
    }
}
