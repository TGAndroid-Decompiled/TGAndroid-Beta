package o8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
import q6.m;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new m6.e(14);
    public String f20856a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return m.k(this.f20856a, ((b) obj).f20856a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20856a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 1, this.f20856a);
        wb.s(parcel, r10);
    }
}
