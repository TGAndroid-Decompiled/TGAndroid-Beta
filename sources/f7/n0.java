package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class n0 extends r6.a {
    public static final Parcelable.Creator<n0> CREATOR = new db.k(8);
    public final boolean f11532a;

    public n0(boolean z10) {
        this.f11532a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0) || this.f11532a != ((n0) obj).f11532a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11532a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f11532a ? 1 : 0);
        cc.s(parcel, r10);
    }
}
