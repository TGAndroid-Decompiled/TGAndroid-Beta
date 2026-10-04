package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w f4389a;
    public final w f4390b;

    public x(w wVar, w wVar2) {
        this.f4389a = wVar;
        this.f4390b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (g6.a.d(this.f4389a, xVar.f4389a) && g6.a.d(this.f4390b, xVar.f4390b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4389a, this.f4390b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.f4389a, i10);
        g0.k(parcel, 3, this.f4390b, i10);
        g0.r(parcel, q6);
    }
}
