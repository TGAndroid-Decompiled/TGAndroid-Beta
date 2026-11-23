package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class n0 extends r6.a {
    public static final Parcelable.Creator<n0> CREATOR = new db.k(8);
    public final boolean f11570a;

    public n0(boolean z10) {
        this.f11570a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0) || this.f11570a != ((n0) obj).f11570a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11570a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f11570a ? 1 : 0);
        bc.s(parcel, r10);
    }
}
