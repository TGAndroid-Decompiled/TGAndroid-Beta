package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class x7d extends b4 {
    public static final Parcelable.Creator<x7d> CREATOR = new v6d((byte) 12);
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public x7d(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x7d) {
            x7d x7dVar = (x7d) obj;
            if (this.a == x7dVar.a && this.b == x7dVar.b && this.c == x7dVar.c && this.d == x7dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder o = ts2.o("NetworkLocationStatus: Wifi status: ", this.a, " Cell status: ", this.b, " elapsed time NS: ");
        o.append(this.d);
        o.append(" system time ms: ");
        o.append(this.c);
        return o.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        mve.q(parcel, 3, 8);
        parcel.writeLong(this.c);
        mve.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        mve.s(parcel, r);
    }
}
