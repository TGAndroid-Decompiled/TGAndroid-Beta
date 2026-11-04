package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class z0 extends q6.a {
    public static final Parcelable.Creator<z0> CREATOR = new w.a(21);
    public final boolean f9908a;

    public z0(boolean z10) {
        this.f9908a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0) || this.f9908a != ((z0) obj).f9908a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9908a)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f9908a ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
