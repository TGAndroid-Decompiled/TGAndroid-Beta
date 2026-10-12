package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f10027a;
    public final int f10028b;
    public final long f10029c;
    public final long d;

    public k(long j10, int i10, int i11, long j11) {
        this.f10027a = i10;
        this.f10028b = i11;
        this.f10029c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f10027a == kVar.f10027a && this.f10028b == kVar.f10028b && this.f10029c == kVar.f10029c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10028b), Integer.valueOf(this.f10027a), Long.valueOf(this.d), Long.valueOf(this.f10029c)});
    }

    public final String toString() {
        StringBuilder l4 = i2.d.l("NetworkLocationStatus: Wifi status: ", this.f10027a, " Cell status: ", this.f10028b, " elapsed time NS: ");
        l4.append(this.d);
        l4.append(" system time ms: ");
        l4.append(this.f10029c);
        return l4.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f10027a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f10028b);
        g0.s(parcel, 3, 8);
        parcel.writeLong(this.f10029c);
        g0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        g0.r(parcel, q6);
    }
}
