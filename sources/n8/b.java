package n8;

import android.os.Parcel;
import android.os.Parcelable;
import i7.p;
import java.util.Arrays;
import p6.m;
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new p(29);
    public String f20278a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return m.k(this.f20278a, ((b) obj).f20278a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20278a});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.f20278a);
        j8.a.t(parcel, s6);
    }
}
