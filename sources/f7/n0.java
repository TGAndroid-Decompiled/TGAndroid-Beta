package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class n0 extends r6.a {
    public static final Parcelable.Creator<n0> CREATOR = new db.k(8);
    public final boolean f11412a;

    public n0(boolean z9) {
        this.f11412a = Boolean.valueOf(z9).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0) || this.f11412a != ((n0) obj).f11412a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11412a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f11412a ? 1 : 0);
        xb.s(parcel, r10);
    }
}
