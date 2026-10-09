package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i0 extends o6.a {
    public static final Parcelable.Creator<i0> CREATOR = new r0(6);
    public final boolean f4486a;

    public i0(boolean z10) {
        this.f4486a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0) || this.f4486a != ((i0) obj).f4486a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4486a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f4486a ? 1 : 0);
        w7.d0.r(parcel, q6);
    }
}
