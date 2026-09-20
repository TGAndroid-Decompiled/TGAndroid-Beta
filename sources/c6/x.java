package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w f4066a;
    public final w f4067b;

    public x(w wVar, w wVar2) {
        this.f4066a = wVar;
        this.f4067b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (g6.a.d(this.f4066a, xVar.f4066a) && g6.a.d(this.f4067b, xVar.f4067b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4066a, this.f4067b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f4066a, i10);
        w7.f0.k(parcel, 3, this.f4067b, i10);
        w7.f0.r(parcel, q6);
    }
}
