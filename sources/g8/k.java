package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f8651a;
    public final int f8652b;
    public final long f8653c;
    public final long d;

    public k(long j3, int i10, int i11, long j10) {
        this.f8651a = i10;
        this.f8652b = i11;
        this.f8653c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f8651a == kVar.f8651a && this.f8652b == kVar.f8652b && this.f8653c == kVar.f8653c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8652b), Integer.valueOf(this.f8651a), Long.valueOf(this.d), Long.valueOf(this.f8653c)});
    }

    public final String toString() {
        StringBuilder n10 = hc.b.n("NetworkLocationStatus: Wifi status: ", this.f8651a, " Cell status: ", this.f8652b, " elapsed time NS: ");
        n10.append(this.d);
        n10.append(" system time ms: ");
        n10.append(this.f8653c);
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f8651a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f8652b);
        e0.s(parcel, 3, 8);
        parcel.writeLong(this.f8653c);
        e0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        e0.r(parcel, q6);
    }
}
