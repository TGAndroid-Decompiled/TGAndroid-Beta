package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class z0 extends r6.a {
    public static final Parcelable.Creator<z0> CREATOR = new db.k(6);
    public final boolean f11628a;

    public z0(boolean z10) {
        this.f11628a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0) || this.f11628a != ((z0) obj).f11628a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11628a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f11628a ? 1 : 0);
        bc.s(parcel, r10);
    }
}
