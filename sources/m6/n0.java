package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class n0 extends y5.a {
    public static final Parcelable.Creator<n0> CREATOR = new h5.h(19);
    public final boolean f17549a;

    public n0(boolean z10) {
        this.f17549a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0) || this.f17549a != ((n0) obj).f17549a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f17549a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f17549a ? 1 : 0);
        p8.r(parcel, q10);
    }
}
