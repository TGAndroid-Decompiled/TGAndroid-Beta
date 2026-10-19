package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f4852a;
    public final String f4853b;

    public h(String str, String str2) {
        this.f4852a = str;
        this.f4853b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (n6.l.l(this.f4852a, hVar.f4852a) && n6.l.l(this.f4853b, hVar.f4853b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4852a, this.f4853b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.f4852a);
        w7.f0.l(parcel, 2, this.f4853b);
        w7.f0.r(parcel, q6);
    }
}
