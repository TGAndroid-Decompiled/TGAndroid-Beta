package h5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class d extends y5.a {
    public static final Parcelable.Creator<d> CREATOR = new h(5);
    public final boolean f9842a;

    public d(boolean z10) {
        this.f9842a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d) || this.f9842a != ((d) obj).f9842a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9842a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f9842a ? 1 : 0);
        p8.r(parcel, q10);
    }
}
