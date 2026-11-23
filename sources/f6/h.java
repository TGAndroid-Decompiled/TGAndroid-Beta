package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f11428a;
    public final String f11429b;

    public h(String str, String str2) {
        this.f11428a = str;
        this.f11429b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (q6.m.l(this.f11428a, hVar.f11428a) && q6.m.l(this.f11429b, hVar.f11429b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11428a, this.f11429b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f11428a);
        bc.l(parcel, 2, this.f11429b);
        bc.s(parcel, r10);
    }
}
