package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import w7.f0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new e6.i(10);
    public double f9434a;
    public boolean f9435b;
    public int f9436c;
    public c6.d d;
    public int e;
    public c6.x f9437f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f9434a == dVar.f9434a && this.f9435b == dVar.f9435b && this.f9436c == dVar.f9436c && a.d(this.d, dVar.d) && this.e == dVar.e) {
            c6.x xVar = this.f9437f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f9434a), Boolean.valueOf(this.f9435b), Integer.valueOf(this.f9436c), this.d, Integer.valueOf(this.e), this.f9437f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f9434a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        double d = this.f9434a;
        f0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.f9435b;
        f0.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.f9436c;
        f0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        f0.k(parcel, 5, this.d, i10);
        int i12 = this.e;
        f0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        f0.k(parcel, 7, this.f9437f, i10);
        double d10 = this.h;
        f0.s(parcel, 8, 8);
        parcel.writeDouble(d10);
        f0.r(parcel, q6);
    }
}
