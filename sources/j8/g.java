package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new j7.b(20);
    public final int f16592a;
    public final int f16593b;
    public final long f16594c;
    public final long d;

    public g(long j3, long j10, int i7, int i10) {
        this.f16592a = i7;
        this.f16593b = i10;
        this.f16594c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f16592a == gVar.f16592a && this.f16593b == gVar.f16593b && this.f16594c == gVar.f16594c && this.d == gVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16593b), Integer.valueOf(this.f16592a), Long.valueOf(this.d), Long.valueOf(this.f16594c)});
    }

    public final String toString() {
        StringBuilder o4 = jg.g.o("NetworkLocationStatus: Wifi status: ", this.f16592a, " Cell status: ", this.f16593b, " elapsed time NS: ");
        o4.append(this.d);
        o4.append(" system time ms: ");
        o4.append(this.f16594c);
        return o4.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f16592a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f16593b);
        wb.q(parcel, 3, 8);
        parcel.writeLong(this.f16594c);
        wb.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        wb.s(parcel, r10);
    }
}
