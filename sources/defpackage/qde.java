package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class qde extends c4 {
    public static final Parcelable.Creator<qde> CREATOR = new g3e((byte) 13);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public qde(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qde)) {
            return false;
        }
        return ((qde) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder l = xnb.l("Node{", this.b, ", id=", this.a, ", hops=");
        l.append(this.c);
        l.append(", isNearby=");
        l.append(this.d);
        l.append("}");
        return l.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bye.s(parcel, r);
    }
}
