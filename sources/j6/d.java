package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import f7.t0;
import java.util.Arrays;
import java.util.Locale;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(28);
    public double f16863a;
    public boolean f16864b;
    public int f16865c;
    public f6.d d;
    public int f16866e;
    public f6.x f16867f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f16863a == dVar.f16863a && this.f16864b == dVar.f16864b && this.f16865c == dVar.f16865c && a.d(this.d, dVar.d) && this.f16866e == dVar.f16866e) {
            f6.x xVar = this.f16867f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f16863a), Boolean.valueOf(this.f16864b), Integer.valueOf(this.f16865c), this.d, Integer.valueOf(this.f16866e), this.f16867f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f16863a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        double d = this.f16863a;
        yb.q(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.f16864b;
        yb.q(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i10 = this.f16865c;
        yb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        yb.k(parcel, 5, this.d, i7);
        int i11 = this.f16866e;
        yb.q(parcel, 6, 4);
        parcel.writeInt(i11);
        yb.k(parcel, 7, this.f16867f, i7);
        double d2 = this.h;
        yb.q(parcel, 8, 8);
        parcel.writeDouble(d2);
        yb.s(parcel, r10);
    }
}
