package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class t extends y5.a {
    public static final Parcelable.Creator<t> CREATOR = new h5.h(20);
    public final boolean f17573a;

    public t(boolean z10) {
        this.f17573a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t) || this.f17573a != ((t) obj).f17573a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f17573a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f17573a ? 1 : 0);
        p8.r(parcel, q10);
    }
}
