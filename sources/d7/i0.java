package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i0 extends p6.a {
    public static final Parcelable.Creator<i0> CREATOR = new r0(7);
    public final boolean f8191a;

    public i0(boolean z10) {
        this.f8191a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0) || this.f8191a != ((i0) obj).f8191a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8191a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f8191a ? 1 : 0);
        df.r(parcel, q5);
    }
}
