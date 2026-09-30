package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f9505a;
    public final int f9506b;
    public final long f9507c;
    public final long d;

    public k(long j3, int i10, int i11, long j10) {
        this.f9505a = i10;
        this.f9506b = i11;
        this.f9507c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f9505a == kVar.f9505a && this.f9506b == kVar.f9506b && this.f9507c == kVar.f9507c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9506b), Integer.valueOf(this.f9505a), Long.valueOf(this.d), Long.valueOf(this.f9507c)});
    }

    public final String toString() {
        StringBuilder k10 = hg.c.k("NetworkLocationStatus: Wifi status: ", this.f9505a, " Cell status: ", this.f9506b, " elapsed time NS: ");
        k10.append(this.d);
        k10.append(" system time ms: ");
        k10.append(this.f9507c);
        return k10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f9505a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f9506b);
        f0.s(parcel, 3, 8);
        parcel.writeLong(this.f9507c);
        f0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        f0.r(parcel, q6);
    }
}
