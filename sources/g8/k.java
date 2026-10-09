package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.d0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f10424a;
    public final int f10425b;
    public final long f10426c;
    public final long d;

    public k(long j3, int i10, int i11, long j10) {
        this.f10424a = i10;
        this.f10425b = i11;
        this.f10426c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f10424a == kVar.f10424a && this.f10425b == kVar.f10425b && this.f10426c == kVar.f10426c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10425b), Integer.valueOf(this.f10424a), Long.valueOf(this.d), Long.valueOf(this.f10426c)});
    }

    public final String toString() {
        StringBuilder k10 = hg.c.k("NetworkLocationStatus: Wifi status: ", this.f10424a, " Cell status: ", this.f10425b, " elapsed time NS: ");
        k10.append(this.d);
        k10.append(" system time ms: ");
        k10.append(this.f10426c);
        return k10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 4);
        parcel.writeInt(this.f10424a);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f10425b);
        d0.s(parcel, 3, 8);
        parcel.writeLong(this.f10426c);
        d0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        d0.r(parcel, q6);
    }
}
