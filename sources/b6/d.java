package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class d extends c6.a {
    public static final Parcelable.Creator<d> CREATOR = new w.a(19);
    public final int f1691a;
    public final String f1692b;

    public d(int i10, String str) {
        this.f1691a = i10;
        this.f1692b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f1691a == this.f1691a && m.l(dVar.f1692b, this.f1692b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1691a;
    }

    public final String toString() {
        return this.f1691a + ":" + this.f1692b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f1691a);
        g5.l(parcel, 2, this.f1692b);
        g5.r(parcel, q10);
    }
}
