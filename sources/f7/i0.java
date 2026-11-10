package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class i0 extends r6.a {
    public static final Parcelable.Creator<i0> CREATOR = new db.k(25);
    public final boolean f11395a;

    public i0(boolean z9) {
        this.f11395a = z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0) || this.f11395a != ((i0) obj).f11395a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11395a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f11395a ? 1 : 0);
        xb.s(parcel, r10);
    }
}
