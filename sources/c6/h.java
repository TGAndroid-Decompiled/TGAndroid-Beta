package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f4313a;
    public final String f4314b;

    public h(String str, String str2) {
        this.f4313a = str;
        this.f4314b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (n6.l.l(this.f4313a, hVar.f4313a) && n6.l.l(this.f4314b, hVar.f4314b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4313a, this.f4314b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f4313a);
        g0.l(parcel, 2, this.f4314b);
        g0.r(parcel, q6);
    }
}
