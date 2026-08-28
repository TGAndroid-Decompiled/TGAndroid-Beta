package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class h extends y5.a {
    public static final Parcelable.Creator<h> CREATOR = new r0(12);
    public final boolean f17525a;

    public h(boolean z10) {
        this.f17525a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h) || this.f17525a != ((h) obj).f17525a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f17525a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f17525a ? 1 : 0);
        p8.r(parcel, q10);
    }
}
