package g8;

import android.os.Parcel;
import android.os.Parcelable;
import hg.k0;
import java.util.Arrays;
import w7.e0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f9523a;
    public final int f9524b;
    public final long f9525c;
    public final long d;

    public k(long j3, int i10, int i11, long j10) {
        this.f9523a = i10;
        this.f9524b = i11;
        this.f9525c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f9523a == kVar.f9523a && this.f9524b == kVar.f9524b && this.f9525c == kVar.f9525c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9524b), Integer.valueOf(this.f9523a), Long.valueOf(this.d), Long.valueOf(this.f9525c)});
    }

    public final String toString() {
        StringBuilder m10 = k0.m("NetworkLocationStatus: Wifi status: ", this.f9523a, " Cell status: ", this.f9524b, " elapsed time NS: ");
        m10.append(this.d);
        m10.append(" system time ms: ");
        m10.append(this.f9525c);
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f9523a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f9524b);
        e0.s(parcel, 3, 8);
        parcel.writeLong(this.f9525c);
        e0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        e0.r(parcel, q6);
    }
}
