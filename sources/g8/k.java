package g8;

import android.os.Parcel;
import android.os.Parcelable;
import hg.k0;
import java.util.Arrays;
import w7.g0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f10350a;
    public final int f10351b;
    public final long f10352c;
    public final long d;

    public k(long j3, int i10, int i11, long j10) {
        this.f10350a = i10;
        this.f10351b = i11;
        this.f10352c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f10350a == kVar.f10350a && this.f10351b == kVar.f10351b && this.f10352c == kVar.f10352c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10351b), Integer.valueOf(this.f10350a), Long.valueOf(this.d), Long.valueOf(this.f10352c)});
    }

    public final String toString() {
        StringBuilder k10 = k0.k("NetworkLocationStatus: Wifi status: ", this.f10350a, " Cell status: ", this.f10351b, " elapsed time NS: ");
        k10.append(this.d);
        k10.append(" system time ms: ");
        k10.append(this.f10352c);
        return k10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f10350a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f10351b);
        g0.s(parcel, 3, 8);
        parcel.writeLong(this.f10352c);
        g0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        g0.r(parcel, q6);
    }
}
