package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class m5d extends b4 {
    public static final Parcelable.Creator<m5d> CREATOR = new t4d((byte) 10);
    public double a;
    public boolean b;
    public int c;
    public wr d;
    public int e;
    public bad f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m5d)) {
            return false;
        }
        m5d m5dVar = (m5d) obj;
        if (this.a == m5dVar.a && this.b == m5dVar.b && this.c == m5dVar.c && id1.d(this.d, m5dVar.d) && this.e == m5dVar.e) {
            bad badVar = this.f;
            if (id1.d(badVar, badVar) && this.h == m5dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.a));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        double d = this.a;
        jte.q(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z = this.b;
        jte.q(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        int i2 = this.c;
        jte.q(parcel, 4, 4);
        parcel.writeInt(i2);
        jte.k(parcel, 5, this.d, i);
        int i3 = this.e;
        jte.q(parcel, 6, 4);
        parcel.writeInt(i3);
        jte.k(parcel, 7, this.f, i);
        double d2 = this.h;
        jte.q(parcel, 8, 8);
        parcel.writeDouble(d2);
        jte.s(parcel, r);
    }
}
