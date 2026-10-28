package h6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class d extends p6.a {
    public static final Parcelable.Creator<d> CREATOR = new f6.i(10);
    public double f12624a;
    public boolean f12625b;
    public int f12626c;
    public d6.d d;
    public int e;
    public d6.x f12627f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f12624a == dVar.f12624a && this.f12625b == dVar.f12625b && this.f12626c == dVar.f12626c && a.d(this.d, dVar.d) && this.e == dVar.e) {
            d6.x xVar = this.f12627f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f12624a), Boolean.valueOf(this.f12625b), Integer.valueOf(this.f12626c), this.d, Integer.valueOf(this.e), this.f12627f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f12624a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        double d = this.f12624a;
        df.s(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.f12625b;
        df.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.f12626c;
        df.s(parcel, 4, 4);
        parcel.writeInt(i11);
        df.k(parcel, 5, this.d, i10);
        int i12 = this.e;
        df.s(parcel, 6, 4);
        parcel.writeInt(i12);
        df.k(parcel, 7, this.f12627f, i10);
        double d10 = this.h;
        df.s(parcel, 8, 8);
        parcel.writeDouble(d10);
        df.r(parcel, q5);
    }
}
