package o8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import q6.m;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new m6.e(13);
    public String f20857a;
    public String f20858b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (m.k(this.f20857a, aVar.f20857a) && m.k(this.f20858b, aVar.f20858b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20857a, this.f20858b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f20857a);
        xb.l(parcel, 2, this.f20858b);
        xb.s(parcel, r10);
    }
}
