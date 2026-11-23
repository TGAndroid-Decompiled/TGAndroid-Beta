package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class i0 extends r6.a {
    public static final Parcelable.Creator<i0> CREATOR = new db.k(25);
    public final boolean f11515a;

    public i0(boolean z10) {
        this.f11515a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0) || this.f11515a != ((i0) obj).f11515a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11515a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f11515a ? 1 : 0);
        cc.s(parcel, r10);
    }
}
