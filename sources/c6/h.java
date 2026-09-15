package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f3991a;
    public final String f3992b;

    public h(String str, String str2) {
        this.f3991a = str;
        this.f3992b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (n6.l.l(this.f3991a, hVar.f3991a) && n6.l.l(this.f3992b, hVar.f3992b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3991a, this.f3992b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 1, this.f3991a);
        w7.e0.l(parcel, 2, this.f3992b);
        w7.e0.r(parcel, q6);
    }
}
