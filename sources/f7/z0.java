package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class z0 extends r6.a {
    public static final Parcelable.Creator<z0> CREATOR = new db.k(6);
    public final boolean f11591a;

    public z0(boolean z10) {
        this.f11591a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0) || this.f11591a != ((z0) obj).f11591a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11591a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f11591a ? 1 : 0);
        cc.s(parcel, r10);
    }
}
