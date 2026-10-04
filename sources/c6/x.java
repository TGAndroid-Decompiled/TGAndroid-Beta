package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w f4390a;
    public final w f4391b;

    public x(w wVar, w wVar2) {
        this.f4390a = wVar;
        this.f4391b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (g6.a.d(this.f4390a, xVar.f4390a) && g6.a.d(this.f4391b, xVar.f4391b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4390a, this.f4391b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.f4390a, i10);
        g0.k(parcel, 3, this.f4391b, i10);
        g0.r(parcel, q6);
    }
}
