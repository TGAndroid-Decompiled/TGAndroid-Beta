package l5;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import l4.j;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new j(6);
    public final boolean f11454a;

    public d(boolean z4) {
        this.f11454a = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d) || this.f11454a != ((d) obj).f11454a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11454a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f11454a ? 1 : 0);
        f5.r(parcel, q10);
    }
}
