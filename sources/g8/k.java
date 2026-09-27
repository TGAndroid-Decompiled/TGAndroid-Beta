package g8;

import android.os.Parcel;
import android.os.Parcelable;
import hg.k0;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f9510a;
    public final int f9511b;
    public final long f9512c;
    public final long d;

    public k(long j3, int i10, int i11, long j10) {
        this.f9510a = i10;
        this.f9511b = i11;
        this.f9512c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f9510a == kVar.f9510a && this.f9511b == kVar.f9511b && this.f9512c == kVar.f9512c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9511b), Integer.valueOf(this.f9510a), Long.valueOf(this.d), Long.valueOf(this.f9512c)});
    }

    public final String toString() {
        StringBuilder l4 = k0.l("NetworkLocationStatus: Wifi status: ", this.f9510a, " Cell status: ", this.f9511b, " elapsed time NS: ");
        l4.append(this.d);
        l4.append(" system time ms: ");
        l4.append(this.f9512c);
        return l4.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f9510a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f9511b);
        f0.s(parcel, 3, 8);
        parcel.writeLong(this.f9512c);
        f0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        f0.r(parcel, q6);
    }
}
