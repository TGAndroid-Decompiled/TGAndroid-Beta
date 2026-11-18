package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new t0(1);
    public final boolean f11517a;

    public h(boolean z10) {
        this.f11517a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h) || this.f11517a != ((h) obj).f11517a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11517a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f11517a ? 1 : 0);
        bc.s(parcel, r10);
    }
}
