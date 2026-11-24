package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class a9e extends b4 {
    public static final Parcelable.Creator<a9e> CREATOR = new qyd((byte) 13);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public a9e(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a9e)) {
            return false;
        }
        return ((a9e) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder l = yjb.l("Node{", this.b, ", id=", this.a, ", hops=");
        l.append(this.c);
        l.append(", isNearby=");
        l.append(this.d);
        l.append("}");
        return l.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        jte.s(parcel, r);
    }
}
