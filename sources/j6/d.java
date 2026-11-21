package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import f7.t0;
import java.util.Arrays;
import java.util.Locale;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(28);
    public double f17270a;
    public boolean f17271b;
    public int f17272c;
    public f6.d d;
    public int f17273e;
    public f6.x f17274f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f17270a == dVar.f17270a && this.f17271b == dVar.f17271b && this.f17272c == dVar.f17272c && a.d(this.d, dVar.d) && this.f17273e == dVar.f17273e) {
            f6.x xVar = this.f17274f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f17270a), Boolean.valueOf(this.f17271b), Integer.valueOf(this.f17272c), this.d, Integer.valueOf(this.f17273e), this.f17274f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f17270a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        double d = this.f17270a;
        bc.q(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.f17271b;
        bc.q(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i10 = this.f17272c;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        bc.k(parcel, 5, this.d, i7);
        int i11 = this.f17273e;
        bc.q(parcel, 6, 4);
        parcel.writeInt(i11);
        bc.k(parcel, 7, this.f17274f, i7);
        double d2 = this.h;
        bc.q(parcel, 8, 8);
        parcel.writeDouble(d2);
        bc.s(parcel, r10);
    }
}
