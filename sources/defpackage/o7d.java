package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class o7d extends b4 {
    public static final Parcelable.Creator<o7d> CREATOR = new v6d((byte) 10);
    public double a;
    public boolean b;
    public int c;
    public ws d;
    public int e;
    public dcd f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o7d)) {
            return false;
        }
        o7d o7dVar = (o7d) obj;
        if (this.a == o7dVar.a && this.b == o7dVar.b && this.c == o7dVar.c && qe1.d(this.d, o7dVar.d) && this.e == o7dVar.e) {
            dcd dcdVar = this.f;
            if (qe1.d(dcdVar, dcdVar) && this.h == o7dVar.h) {
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
        int r = mve.r(parcel, 20293);
        double d = this.a;
        mve.q(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z = this.b;
        mve.q(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        int i2 = this.c;
        mve.q(parcel, 4, 4);
        parcel.writeInt(i2);
        mve.k(parcel, 5, this.d, i);
        int i3 = this.e;
        mve.q(parcel, 6, 4);
        parcel.writeInt(i3);
        mve.k(parcel, 7, this.f, i);
        double d2 = this.h;
        mve.q(parcel, 8, 8);
        parcel.writeDouble(d2);
        mve.s(parcel, r);
    }
}
