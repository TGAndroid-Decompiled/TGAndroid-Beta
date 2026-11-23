package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f11391a;
    public final String f11392b;

    public h(String str, String str2) {
        this.f11391a = str;
        this.f11392b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (q6.m.l(this.f11391a, hVar.f11391a) && q6.m.l(this.f11392b, hVar.f11392b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11391a, this.f11392b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.f11391a);
        cc.l(parcel, 2, this.f11392b);
        cc.s(parcel, r10);
    }
}
