package g8;

import android.os.Parcel;
import android.os.Parcelable;
import hg.k0;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f9522a;
    public final int f9523b;
    public final long f9524c;
    public final long d;

    public k(long j3, int i10, int i11, long j10) {
        this.f9522a = i10;
        this.f9523b = i11;
        this.f9524c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f9522a == kVar.f9522a && this.f9523b == kVar.f9523b && this.f9524c == kVar.f9524c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9523b), Integer.valueOf(this.f9522a), Long.valueOf(this.d), Long.valueOf(this.f9524c)});
    }

    public final String toString() {
        StringBuilder k10 = k0.k("NetworkLocationStatus: Wifi status: ", this.f9522a, " Cell status: ", this.f9523b, " elapsed time NS: ");
        k10.append(this.d);
        k10.append(" system time ms: ");
        k10.append(this.f9524c);
        return k10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f9522a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f9523b);
        f0.s(parcel, 3, 8);
        parcel.writeLong(this.f9524c);
        f0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        f0.r(parcel, q6);
    }
}
