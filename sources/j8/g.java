package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new j7.b(20);
    public final int f16948a;
    public final int f16949b;
    public final long f16950c;
    public final long d;

    public g(long j3, long j10, int i7, int i10) {
        this.f16948a = i7;
        this.f16949b = i10;
        this.f16950c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f16948a == gVar.f16948a && this.f16949b == gVar.f16949b && this.f16950c == gVar.f16950c && this.d == gVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16949b), Integer.valueOf(this.f16948a), Long.valueOf(this.d), Long.valueOf(this.f16950c)});
    }

    public final String toString() {
        StringBuilder n10 = i5.c.n("NetworkLocationStatus: Wifi status: ", this.f16948a, " Cell status: ", this.f16949b, " elapsed time NS: ");
        n10.append(this.d);
        n10.append(" system time ms: ");
        n10.append(this.f16950c);
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f16948a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f16949b);
        yb.q(parcel, 3, 8);
        parcel.writeLong(this.f16950c);
        yb.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        yb.s(parcel, r10);
    }
}
