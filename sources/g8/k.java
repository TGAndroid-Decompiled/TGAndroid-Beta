package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f10351a;
    public final int f10352b;
    public final long f10353c;
    public final long d;

    public k(long j3, int i10, int i11, long j10) {
        this.f10351a = i10;
        this.f10352b = i11;
        this.f10353c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f10351a == kVar.f10351a && this.f10352b == kVar.f10352b && this.f10353c == kVar.f10353c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10352b), Integer.valueOf(this.f10351a), Long.valueOf(this.d), Long.valueOf(this.f10353c)});
    }

    public final String toString() {
        StringBuilder k10 = hg.c.k("NetworkLocationStatus: Wifi status: ", this.f10351a, " Cell status: ", this.f10352b, " elapsed time NS: ");
        k10.append(this.d);
        k10.append(" system time ms: ");
        k10.append(this.f10353c);
        return k10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f10351a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f10352b);
        g0.s(parcel, 3, 8);
        parcel.writeLong(this.f10353c);
        g0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        g0.r(parcel, q6);
    }
}
