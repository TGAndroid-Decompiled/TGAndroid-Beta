package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import w7.h0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new e6.p(9);
    public double f7371a;
    public boolean f7372b;
    public int f7373c;
    public c6.d d;
    public int e;
    public c6.x f7374f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f7371a == dVar.f7371a && this.f7372b == dVar.f7372b && this.f7373c == dVar.f7373c && a.d(this.d, dVar.d) && this.e == dVar.e) {
            c6.x xVar = this.f7374f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f7371a), Boolean.valueOf(this.f7372b), Integer.valueOf(this.f7373c), this.d, Integer.valueOf(this.e), this.f7374f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f7371a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        double d = this.f7371a;
        h0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.f7372b;
        h0.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.f7373c;
        h0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        h0.k(parcel, 5, this.d, i10);
        int i12 = this.e;
        h0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        h0.k(parcel, 7, this.f7374f, i10);
        double d10 = this.h;
        h0.s(parcel, 8, 8);
        parcel.writeDouble(d10);
        h0.r(parcel, q6);
    }
}
