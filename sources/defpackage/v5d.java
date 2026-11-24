package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class v5d extends b4 {
    public static final Parcelable.Creator<v5d> CREATOR = new t4d((byte) 12);
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public v5d(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v5d) {
            v5d v5dVar = (v5d) obj;
            if (this.a == v5dVar.a && this.b == v5dVar.b && this.c == v5dVar.c && this.d == v5dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder p = ir2.p("NetworkLocationStatus: Wifi status: ", this.a, " Cell status: ", this.b, " elapsed time NS: ");
        p.append(this.d);
        p.append(" system time ms: ");
        p.append(this.c);
        return p.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        jte.q(parcel, 3, 8);
        parcel.writeLong(this.c);
        jte.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        jte.s(parcel, r);
    }
}
