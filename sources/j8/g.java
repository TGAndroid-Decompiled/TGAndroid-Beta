package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new j7.b(20);
    public final int f16595a;
    public final int f16596b;
    public final long f16597c;
    public final long d;

    public g(long j3, long j10, int i7, int i10) {
        this.f16595a = i7;
        this.f16596b = i10;
        this.f16597c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f16595a == gVar.f16595a && this.f16596b == gVar.f16596b && this.f16597c == gVar.f16597c && this.d == gVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16596b), Integer.valueOf(this.f16595a), Long.valueOf(this.d), Long.valueOf(this.f16597c)});
    }

    public final String toString() {
        StringBuilder o4 = jg.g.o("NetworkLocationStatus: Wifi status: ", this.f16595a, " Cell status: ", this.f16596b, " elapsed time NS: ");
        o4.append(this.d);
        o4.append(" system time ms: ");
        o4.append(this.f16597c);
        return o4.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f16595a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f16596b);
        xb.q(parcel, 3, 8);
        parcel.writeLong(this.f16597c);
        xb.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        xb.s(parcel, r10);
    }
}
