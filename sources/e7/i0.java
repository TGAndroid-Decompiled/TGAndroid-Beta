package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class i0 extends q6.a {
    public static final Parcelable.Creator<i0> CREATOR = new r0(10);
    public final boolean f9833a;

    public i0(boolean z10) {
        this.f9833a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0) || this.f9833a != ((i0) obj).f9833a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9833a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f9833a ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
