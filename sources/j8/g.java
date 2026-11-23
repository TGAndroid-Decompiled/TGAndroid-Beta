package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new j7.b(20);
    public final int f17324a;
    public final int f17325b;
    public final long f17326c;
    public final long d;

    public g(long j3, long j10, int i7, int i10) {
        this.f17324a = i7;
        this.f17325b = i10;
        this.f17326c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f17324a == gVar.f17324a && this.f17325b == gVar.f17325b && this.f17326c == gVar.f17326c && this.d == gVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17325b), Integer.valueOf(this.f17324a), Long.valueOf(this.d), Long.valueOf(this.f17326c)});
    }

    public final String toString() {
        StringBuilder n10 = i5.c.n("NetworkLocationStatus: Wifi status: ", this.f17324a, " Cell status: ", this.f17325b, " elapsed time NS: ");
        n10.append(this.d);
        n10.append(" system time ms: ");
        n10.append(this.f17326c);
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f17324a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f17325b);
        cc.q(parcel, 3, 8);
        parcel.writeLong(this.f17326c);
        cc.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        cc.s(parcel, r10);
    }
}
