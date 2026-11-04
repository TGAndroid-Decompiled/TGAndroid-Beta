package e6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class h extends q6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(1);
    public final String f9708a;
    public final String f9709b;

    public h(String str, String str2) {
        this.f9708a = str;
        this.f9709b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (p6.m.k(this.f9708a, hVar.f9708a) && p6.m.k(this.f9709b, hVar.f9709b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9708a, this.f9709b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.f9708a);
        j8.a.m(parcel, 2, this.f9709b);
        j8.a.t(parcel, s6);
    }
}
