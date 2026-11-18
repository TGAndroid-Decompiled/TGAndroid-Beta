package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import f7.t0;
import java.util.Arrays;
import java.util.Locale;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(28);
    public double f17245a;
    public boolean f17246b;
    public int f17247c;
    public f6.d d;
    public int f17248e;
    public f6.x f17249f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f17245a == dVar.f17245a && this.f17246b == dVar.f17246b && this.f17247c == dVar.f17247c && a.d(this.d, dVar.d) && this.f17248e == dVar.f17248e) {
            f6.x xVar = this.f17249f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f17245a), Boolean.valueOf(this.f17246b), Integer.valueOf(this.f17247c), this.d, Integer.valueOf(this.f17248e), this.f17249f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f17245a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        double d = this.f17245a;
        bc.q(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.f17246b;
        bc.q(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i10 = this.f17247c;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        bc.k(parcel, 5, this.d, i7);
        int i11 = this.f17248e;
        bc.q(parcel, 6, 4);
        parcel.writeInt(i11);
        bc.k(parcel, 7, this.f17249f, i7);
        double d2 = this.h;
        bc.q(parcel, 8, 8);
        parcel.writeDouble(d2);
        bc.s(parcel, r10);
    }
}
