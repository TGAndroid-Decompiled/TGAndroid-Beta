package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new w.a(19);
    public final int f1564a;
    public final String f1565b;

    public d(int i10, String str) {
        this.f1564a = i10;
        this.f1565b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f1564a == this.f1564a && m.l(dVar.f1565b, this.f1565b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1564a;
    }

    public final String toString() {
        return this.f1564a + ":" + this.f1565b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f1564a);
        f5.l(parcel, 2, this.f1565b);
        f5.r(parcel, q10);
    }
}
