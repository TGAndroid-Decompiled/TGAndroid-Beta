package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class t extends q6.a {
    public static final Parcelable.Creator<t> CREATOR = new w.a(24);
    public final boolean f9874a;

    public t(boolean z10) {
        this.f9874a = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t) || this.f9874a != ((t) obj).f9874a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9874a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f9874a ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
