package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f11079a;
    public final String f11080b;

    public h(String str, String str2) {
        this.f11079a = str;
        this.f11080b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (q6.m.k(this.f11079a, hVar.f11079a) && q6.m.k(this.f11080b, hVar.f11080b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11079a, this.f11080b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.f11079a);
        yb.l(parcel, 2, this.f11080b);
        yb.s(parcel, r10);
    }
}
