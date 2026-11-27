package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
public final class fad extends c4 {
    public static final Parcelable.Creator<fad> CREATOR = new m9d((byte) 10);
    public double a;
    public boolean b;
    public int c;
    public xr d;
    public int e;
    public ued f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fad)) {
            return false;
        }
        fad fadVar = (fad) obj;
        if (this.a == fadVar.a && this.b == fadVar.b && this.c == fadVar.c && qd1.d(this.d, fadVar.d) && this.e == fadVar.e) {
            ued uedVar = this.f;
            if (qd1.d(uedVar, uedVar) && this.h == fadVar.h) {
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
        int r = bye.r(parcel, 20293);
        double d = this.a;
        bye.q(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z = this.b;
        bye.q(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        int i2 = this.c;
        bye.q(parcel, 4, 4);
        parcel.writeInt(i2);
        bye.k(parcel, 5, this.d, i);
        int i3 = this.e;
        bye.q(parcel, 6, 4);
        parcel.writeInt(i3);
        bye.k(parcel, 7, this.f, i);
        double d2 = this.h;
        bye.q(parcel, 8, 8);
        parcel.writeDouble(d2);
        bye.s(parcel, r);
    }
}
