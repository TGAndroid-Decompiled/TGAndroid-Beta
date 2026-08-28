package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class i0 extends y5.a {
    public static final Parcelable.Creator<i0> CREATOR = new r0(6);
    public final boolean f17532a;

    public i0(boolean z10) {
        this.f17532a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0) || this.f17532a != ((i0) obj).f17532a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f17532a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f17532a ? 1 : 0);
        p8.r(parcel, q10);
    }
}
