package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class x extends a6.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w f19345a;
    public final w f19346b;

    public x(w wVar, w wVar2) {
        this.f19345a = wVar;
        this.f19346b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (s5.a.d(this.f19345a, xVar.f19345a) && s5.a.d(this.f19346b, xVar.f19346b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19345a, this.f19346b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.f19345a, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f19346b, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
