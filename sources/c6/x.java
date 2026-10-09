package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w f4440a;
    public final w f4441b;

    public x(w wVar, w wVar2) {
        this.f4440a = wVar;
        this.f4441b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (g6.a.d(this.f4440a, xVar.f4440a) && g6.a.d(this.f4441b, xVar.f4441b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4440a, this.f4441b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.k(parcel, 2, this.f4440a, i10);
        w7.d0.k(parcel, 3, this.f4441b, i10);
        w7.d0.r(parcel, q6);
    }
}
