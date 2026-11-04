package n8;

import android.os.Parcel;
import android.os.Parcelable;
import i7.p;
import java.util.Arrays;
import p6.m;
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new p(28);
    public String f20276a;
    public String f20277b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (m.k(this.f20276a, aVar.f20276a) && m.k(this.f20277b, aVar.f20277b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20276a, this.f20277b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.f20276a);
        j8.a.m(parcel, 2, this.f20277b);
        j8.a.t(parcel, s6);
    }
}
