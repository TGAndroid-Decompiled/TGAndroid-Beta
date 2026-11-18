package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new j7.b(20);
    public final int f17333a;
    public final int f17334b;
    public final long f17335c;
    public final long d;

    public g(long j3, long j10, int i7, int i10) {
        this.f17333a = i7;
        this.f17334b = i10;
        this.f17335c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f17333a == gVar.f17333a && this.f17334b == gVar.f17334b && this.f17335c == gVar.f17335c && this.d == gVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17334b), Integer.valueOf(this.f17333a), Long.valueOf(this.d), Long.valueOf(this.f17335c)});
    }

    public final String toString() {
        StringBuilder n10 = i5.c.n("NetworkLocationStatus: Wifi status: ", this.f17333a, " Cell status: ", this.f17334b, " elapsed time NS: ");
        n10.append(this.d);
        n10.append(" system time ms: ");
        n10.append(this.f17335c);
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f17333a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f17334b);
        bc.q(parcel, 3, 8);
        parcel.writeLong(this.f17335c);
        bc.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        bc.s(parcel, r10);
    }
}
