package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import f7.t0;
import java.util.Arrays;
import java.util.Locale;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(28);
    public double f16512a;
    public boolean f16513b;
    public int f16514c;
    public f6.d d;
    public int f16515e;
    public f6.x f16516f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f16512a == dVar.f16512a && this.f16513b == dVar.f16513b && this.f16514c == dVar.f16514c && a.d(this.d, dVar.d) && this.f16515e == dVar.f16515e) {
            f6.x xVar = this.f16516f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f16512a), Boolean.valueOf(this.f16513b), Integer.valueOf(this.f16514c), this.d, Integer.valueOf(this.f16515e), this.f16516f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f16512a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        double d = this.f16512a;
        xb.q(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z9 = this.f16513b;
        xb.q(parcel, 3, 4);
        parcel.writeInt(z9 ? 1 : 0);
        int i10 = this.f16514c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        xb.k(parcel, 5, this.d, i7);
        int i11 = this.f16515e;
        xb.q(parcel, 6, 4);
        parcel.writeInt(i11);
        xb.k(parcel, 7, this.f16516f, i7);
        double d2 = this.h;
        xb.q(parcel, 8, 8);
        parcel.writeDouble(d2);
        xb.s(parcel, r10);
    }
}
