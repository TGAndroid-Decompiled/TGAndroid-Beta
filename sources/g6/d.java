package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import w7.e0;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new e6.i(10);
    public double f9417a;
    public boolean f9418b;
    public int f9419c;
    public c6.d d;
    public int e;
    public c6.x f9420f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f9417a == dVar.f9417a && this.f9418b == dVar.f9418b && this.f9419c == dVar.f9419c && a.d(this.d, dVar.d) && this.e == dVar.e) {
            c6.x xVar = this.f9420f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f9417a), Boolean.valueOf(this.f9418b), Integer.valueOf(this.f9419c), this.d, Integer.valueOf(this.e), this.f9420f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f9417a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        double d = this.f9417a;
        e0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.f9418b;
        e0.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.f9419c;
        e0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        e0.k(parcel, 5, this.d, i10);
        int i12 = this.e;
        e0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        e0.k(parcel, 7, this.f9420f, i10);
        double d10 = this.h;
        e0.s(parcel, 8, 8);
        parcel.writeDouble(d10);
        e0.r(parcel, q6);
    }
}
