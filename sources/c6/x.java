package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w f3953a;
    public final w f3954b;

    public x(w wVar, w wVar2) {
        this.f3953a = wVar;
        this.f3954b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (g6.a.d(this.f3953a, xVar.f3953a) && g6.a.d(this.f3954b, xVar.f3954b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3953a, this.f3954b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 2, this.f3953a, i10);
        h0.k(parcel, 3, this.f3954b, i10);
        h0.r(parcel, q6);
    }
}
