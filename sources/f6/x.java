package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w f11343a;
    public final w f11344b;

    public x(w wVar, w wVar2) {
        this.f11343a = wVar;
        this.f11344b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (j6.a.d(this.f11343a, xVar.f11343a) && j6.a.d(this.f11344b, xVar.f11344b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11343a, this.f11344b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.f11343a, i7);
        xb.k(parcel, 3, this.f11344b, i7);
        xb.s(parcel, r10);
    }
}
