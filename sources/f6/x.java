package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w f11506a;
    public final w f11507b;

    public x(w wVar, w wVar2) {
        this.f11506a = wVar;
        this.f11507b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (j6.a.d(this.f11506a, xVar.f11506a) && j6.a.d(this.f11507b, xVar.f11507b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11506a, this.f11507b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f11506a, i7);
        bc.k(parcel, 3, this.f11507b, i7);
        bc.s(parcel, r10);
    }
}
