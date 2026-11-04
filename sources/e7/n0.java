package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class n0 extends q6.a {
    public static final Parcelable.Creator<n0> CREATOR = new w.a(23);
    public final boolean f9850a;

    public n0(boolean z10) {
        this.f9850a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0) || this.f9850a != ((n0) obj).f9850a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9850a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f9850a ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
