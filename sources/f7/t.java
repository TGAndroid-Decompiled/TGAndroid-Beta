package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class t extends r6.a {
    public static final Parcelable.Creator<t> CREATOR = new db.k(9);
    public final boolean f11556a;

    public t(boolean z10) {
        this.f11556a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t) || this.f11556a != ((t) obj).f11556a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11556a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f11556a ? 1 : 0);
        cc.s(parcel, r10);
    }
}
