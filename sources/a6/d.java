package a6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new w.a(6);
    public final boolean f284a;

    public d(boolean z10) {
        this.f284a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d) || this.f284a != ((d) obj).f284a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f284a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f284a ? 1 : 0);
        yb.s(parcel, r10);
    }
}
