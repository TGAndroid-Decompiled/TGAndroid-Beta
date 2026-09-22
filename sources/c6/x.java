package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w f4062a;
    public final w f4063b;

    public x(w wVar, w wVar2) {
        this.f4062a = wVar;
        this.f4063b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (g6.a.d(this.f4062a, xVar.f4062a) && g6.a.d(this.f4063b, xVar.f4063b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4062a, this.f4063b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.f4062a, i10);
        w7.e0.k(parcel, 3, this.f4063b, i10);
        w7.e0.r(parcel, q6);
    }
}
