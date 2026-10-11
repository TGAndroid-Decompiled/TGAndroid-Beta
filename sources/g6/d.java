package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import w7.d0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new e6.i(10);
    public double f10326a;
    public boolean f10327b;
    public int f10328c;
    public c6.d d;
    public int f10329e;
    public c6.x f10330f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f10326a == dVar.f10326a && this.f10327b == dVar.f10327b && this.f10328c == dVar.f10328c && a.d(this.d, dVar.d) && this.f10329e == dVar.f10329e) {
            c6.x xVar = this.f10330f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f10326a), Boolean.valueOf(this.f10327b), Integer.valueOf(this.f10328c), this.d, Integer.valueOf(this.f10329e), this.f10330f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f10326a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        double d = this.f10326a;
        d0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.f10327b;
        d0.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.f10328c;
        d0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        d0.k(parcel, 5, this.d, i10);
        int i12 = this.f10329e;
        d0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        d0.k(parcel, 7, this.f10330f, i10);
        double d10 = this.h;
        d0.s(parcel, 8, 8);
        parcel.writeDouble(d10);
        d0.r(parcel, q6);
    }
}
