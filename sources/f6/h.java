package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f11399a;
    public final String f11400b;

    public h(String str, String str2) {
        this.f11399a = str;
        this.f11400b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (q6.m.l(this.f11399a, hVar.f11399a) && q6.m.l(this.f11400b, hVar.f11400b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11399a, this.f11400b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f11399a);
        bc.l(parcel, 2, this.f11400b);
        bc.s(parcel, r10);
    }
}
