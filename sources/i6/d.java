package i6;

import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
import java.util.Arrays;
import java.util.Locale;
public final class d extends q6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(13);
    public double f14624a;
    public boolean f14625b;
    public int f14626c;
    public e6.d d;
    public int f14627e;
    public e6.x f14628f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f14624a == dVar.f14624a && this.f14625b == dVar.f14625b && this.f14626c == dVar.f14626c && a.d(this.d, dVar.d) && this.f14627e == dVar.f14627e) {
            e6.x xVar = this.f14628f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f14624a), Boolean.valueOf(this.f14625b), Integer.valueOf(this.f14626c), this.d, Integer.valueOf(this.f14627e), this.f14628f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f14624a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        double d = this.f14624a;
        j8.a.r(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.f14625b;
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i10 = this.f14626c;
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(i10);
        j8.a.l(parcel, 5, this.d, i3);
        int i11 = this.f14627e;
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(i11);
        j8.a.l(parcel, 7, this.f14628f, i3);
        double d10 = this.h;
        j8.a.r(parcel, 8, 8);
        parcel.writeDouble(d10);
        j8.a.t(parcel, s6);
    }
}
