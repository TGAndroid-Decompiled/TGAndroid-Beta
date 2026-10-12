package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import w7.c0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new e6.i(10);
    public double f10325a;
    public boolean f10326b;
    public int f10327c;
    public c6.d d;
    public int f10328e;
    public c6.x f10329f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f10325a == dVar.f10325a && this.f10326b == dVar.f10326b && this.f10327c == dVar.f10327c && a.d(this.d, dVar.d) && this.f10328e == dVar.f10328e) {
            c6.x xVar = this.f10329f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f10325a), Boolean.valueOf(this.f10326b), Integer.valueOf(this.f10327c), this.d, Integer.valueOf(this.f10328e), this.f10329f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f10325a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        double d = this.f10325a;
        c0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.f10326b;
        c0.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.f10327c;
        c0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        c0.k(parcel, 5, this.d, i10);
        int i12 = this.f10328e;
        c0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        c0.k(parcel, 7, this.f10329f, i10);
        double d10 = this.h;
        c0.s(parcel, 8, 8);
        parcel.writeDouble(d10);
        c0.r(parcel, q6);
    }
}
