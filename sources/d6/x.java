package d6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class x extends p6.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w f8149a;
    public final w f8150b;

    public x(w wVar, w wVar2) {
        this.f8149a = wVar;
        this.f8150b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (h6.a.d(this.f8149a, xVar.f8149a) && h6.a.d(this.f8150b, xVar.f8150b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8149a, this.f8150b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.f8149a, i10);
        df.k(parcel, 3, this.f8150b, i10);
        df.r(parcel, q5);
    }
}
