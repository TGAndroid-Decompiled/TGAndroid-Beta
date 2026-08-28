package m5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class x extends y5.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w f17486a;
    public final w f17487b;

    public x(w wVar, w wVar2) {
        this.f17486a = wVar;
        this.f17487b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (q5.a.d(this.f17486a, xVar.f17486a) && q5.a.d(this.f17487b, xVar.f17487b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17486a, this.f17487b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.f17486a, i9);
        p8.k(parcel, 3, this.f17487b, i9);
        p8.r(parcel, q10);
    }
}
