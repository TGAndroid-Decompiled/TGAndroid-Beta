package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w f11157a;
    public final w f11158b;

    public x(w wVar, w wVar2) {
        this.f11157a = wVar;
        this.f11158b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (j6.a.d(this.f11157a, xVar.f11157a) && j6.a.d(this.f11158b, xVar.f11158b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11157a, this.f11158b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 2, this.f11157a, i7);
        yb.k(parcel, 3, this.f11158b, i7);
        yb.s(parcel, r10);
    }
}
