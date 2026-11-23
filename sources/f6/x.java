package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w f11468a;
    public final w f11469b;

    public x(w wVar, w wVar2) {
        this.f11468a = wVar;
        this.f11469b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (j6.a.d(this.f11468a, xVar.f11468a) && j6.a.d(this.f11469b, xVar.f11469b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11468a, this.f11469b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.f11468a, i7);
        cc.k(parcel, 3, this.f11469b, i7);
        cc.s(parcel, r10);
    }
}
