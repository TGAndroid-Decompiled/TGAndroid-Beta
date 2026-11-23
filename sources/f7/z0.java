package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class z0 extends r6.a {
    public static final Parcelable.Creator<z0> CREATOR = new db.k(6);
    public final boolean f11590a;

    public z0(boolean z10) {
        this.f11590a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0) || this.f11590a != ((z0) obj).f11590a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11590a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f11590a ? 1 : 0);
        cc.s(parcel, r10);
    }
}
