package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import w7.g0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new e6.i(10);
    public double f10254a;
    public boolean f10255b;
    public int f10256c;
    public c6.d d;
    public int f10257e;
    public c6.x f10258f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f10254a == dVar.f10254a && this.f10255b == dVar.f10255b && this.f10256c == dVar.f10256c && a.d(this.d, dVar.d) && this.f10257e == dVar.f10257e) {
            c6.x xVar = this.f10258f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f10254a), Boolean.valueOf(this.f10255b), Integer.valueOf(this.f10256c), this.d, Integer.valueOf(this.f10257e), this.f10258f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f10254a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        double d = this.f10254a;
        g0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.f10255b;
        g0.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.f10256c;
        g0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g0.k(parcel, 5, this.d, i10);
        int i12 = this.f10257e;
        g0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        g0.k(parcel, 7, this.f10258f, i10);
        double d10 = this.h;
        g0.s(parcel, 8, 8);
        parcel.writeDouble(d10);
        g0.r(parcel, q6);
    }
}
