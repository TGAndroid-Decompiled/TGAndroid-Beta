package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f11265a;
    public final String f11266b;

    public h(String str, String str2) {
        this.f11265a = str;
        this.f11266b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (q6.m.k(this.f11265a, hVar.f11265a) && q6.m.k(this.f11266b, hVar.f11266b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11265a, this.f11266b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f11265a);
        xb.l(parcel, 2, this.f11266b);
        xb.s(parcel, r10);
    }
}
