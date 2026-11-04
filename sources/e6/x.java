package e6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class x extends q6.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w f9786a;
    public final w f9787b;

    public x(w wVar, w wVar2) {
        this.f9786a = wVar;
        this.f9787b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (i6.a.d(this.f9786a, xVar.f9786a) && i6.a.d(this.f9787b, xVar.f9787b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9786a, this.f9787b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.f9786a, i3);
        j8.a.l(parcel, 3, this.f9787b, i3);
        j8.a.t(parcel, s6);
    }
}
