package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f11270a;
    public final String f11271b;

    public h(String str, String str2) {
        this.f11270a = str;
        this.f11271b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (q6.m.k(this.f11270a, hVar.f11270a) && q6.m.k(this.f11271b, hVar.f11271b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11270a, this.f11271b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f11270a);
        xb.l(parcel, 2, this.f11271b);
        xb.s(parcel, r10);
    }
}
