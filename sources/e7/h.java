package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h extends q6.a {
    public static final Parcelable.Creator<h> CREATOR = new r0(16);
    public final boolean f9826a;

    public h(boolean z10) {
        this.f9826a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h) || this.f9826a != ((h) obj).f9826a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9826a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f9826a ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
