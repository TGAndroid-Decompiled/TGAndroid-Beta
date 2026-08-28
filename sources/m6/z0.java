package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class z0 extends y5.a {
    public static final Parcelable.Creator<z0> CREATOR = new h5.h(17);
    public final boolean f17606a;

    public z0(boolean z10) {
        this.f17606a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0) || this.f17606a != ((z0) obj).f17606a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f17606a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f17606a ? 1 : 0);
        p8.r(parcel, q10);
    }
}
