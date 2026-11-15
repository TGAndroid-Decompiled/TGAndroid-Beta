package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new t0(1);
    public final boolean f11197a;

    public h(boolean z10) {
        this.f11197a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h) || this.f11197a != ((h) obj).f11197a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11197a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f11197a ? 1 : 0);
        yb.s(parcel, r10);
    }
}
