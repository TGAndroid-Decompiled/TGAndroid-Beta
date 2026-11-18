package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class t extends r6.a {
    public static final Parcelable.Creator<t> CREATOR = new db.k(9);
    public final boolean f11564a;

    public t(boolean z10) {
        this.f11564a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t) || this.f11564a != ((t) obj).f11564a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11564a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f11564a ? 1 : 0);
        bc.s(parcel, r10);
    }
}
