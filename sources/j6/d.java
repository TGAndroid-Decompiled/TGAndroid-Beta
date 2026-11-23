package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import f7.t0;
import java.util.Arrays;
import java.util.Locale;
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(28);
    public double f17336a;
    public boolean f17337b;
    public int f17338c;
    public f6.d d;
    public int f17339e;
    public f6.x f17340f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f17336a == dVar.f17336a && this.f17337b == dVar.f17337b && this.f17338c == dVar.f17338c && a.d(this.d, dVar.d) && this.f17339e == dVar.f17339e) {
            f6.x xVar = this.f17340f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f17336a), Boolean.valueOf(this.f17337b), Integer.valueOf(this.f17338c), this.d, Integer.valueOf(this.f17339e), this.f17340f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f17336a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        double d = this.f17336a;
        cc.q(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.f17337b;
        cc.q(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i10 = this.f17338c;
        cc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        cc.k(parcel, 5, this.d, i7);
        int i11 = this.f17339e;
        cc.q(parcel, 6, 4);
        parcel.writeInt(i11);
        cc.k(parcel, 7, this.f17340f, i7);
        double d2 = this.h;
        cc.q(parcel, 8, 8);
        parcel.writeDouble(d2);
        cc.s(parcel, r10);
    }
}
