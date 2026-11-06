package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
public final class n0 extends r6.a {
    public static final Parcelable.Creator<n0> CREATOR = new db.k(8);
    public final boolean f11407a;

    public n0(boolean z9) {
        this.f11407a = Boolean.valueOf(z9).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0) || this.f11407a != ((n0) obj).f11407a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11407a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f11407a ? 1 : 0);
        wb.s(parcel, r10);
    }
}
