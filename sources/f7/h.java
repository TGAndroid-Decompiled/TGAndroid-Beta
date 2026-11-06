package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new t0(1);
    public final boolean f11383a;

    public h(boolean z9) {
        this.f11383a = z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h) || this.f11383a != ((h) obj).f11383a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11383a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f11383a ? 1 : 0);
        xb.s(parcel, r10);
    }
}
