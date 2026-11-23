package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f11390a;
    public final String f11391b;

    public h(String str, String str2) {
        this.f11390a = str;
        this.f11391b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (q6.m.l(this.f11390a, hVar.f11390a) && q6.m.l(this.f11391b, hVar.f11391b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11390a, this.f11391b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.f11390a);
        cc.l(parcel, 2, this.f11391b);
        cc.s(parcel, r10);
    }
}
