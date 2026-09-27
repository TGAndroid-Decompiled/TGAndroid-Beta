package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f3990a;
    public final String f3991b;

    public h(String str, String str2) {
        this.f3990a = str;
        this.f3991b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (n6.l.l(this.f3990a, hVar.f3990a) && n6.l.l(this.f3991b, hVar.f3991b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3990a, this.f3991b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f3990a);
        w7.f0.l(parcel, 2, this.f3991b);
        w7.f0.r(parcel, q6);
    }
}
