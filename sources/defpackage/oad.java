package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class oad extends c4 {
    public static final Parcelable.Creator<oad> CREATOR = new m9d((byte) 12);
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public oad(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oad) {
            oad oadVar = (oad) obj;
            if (this.a == oadVar.a && this.b == oadVar.b && this.c == oadVar.c && this.d == oadVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder p = bs2.p("NetworkLocationStatus: Wifi status: ", this.a, " Cell status: ", this.b, " elapsed time NS: ");
        p.append(this.d);
        p.append(" system time ms: ");
        p.append(this.c);
        return p.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bye.q(parcel, 3, 8);
        parcel.writeLong(this.c);
        bye.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        bye.s(parcel, r);
    }
}
