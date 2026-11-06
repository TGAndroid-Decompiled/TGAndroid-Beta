package o8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
import q6.m;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new m6.e(13);
    public String f20854a;
    public String f20855b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (m.k(this.f20854a, aVar.f20854a) && m.k(this.f20855b, aVar.f20855b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20854a, this.f20855b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 1, this.f20854a);
        wb.l(parcel, 2, this.f20855b);
        wb.s(parcel, r10);
    }
}
