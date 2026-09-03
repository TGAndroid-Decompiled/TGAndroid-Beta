package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new w.a(19);
    public final int f1575a;
    public final String f1576b;

    public d(int i10, String str) {
        this.f1575a = i10;
        this.f1576b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f1575a == this.f1575a && m.l(dVar.f1576b, this.f1576b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1575a;
    }

    public final String toString() {
        return this.f1575a + ":" + this.f1576b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f1575a);
        f5.l(parcel, 2, this.f1576b);
        f5.r(parcel, q10);
    }
}
