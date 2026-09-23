package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f9506a;
    public final int f9507b;
    public final long f9508c;
    public final long d;

    public k(long j3, int i10, int i11, long j10) {
        this.f9506a = i10;
        this.f9507b = i11;
        this.f9508c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f9506a == kVar.f9506a && this.f9507b == kVar.f9507b && this.f9508c == kVar.f9508c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9507b), Integer.valueOf(this.f9506a), Long.valueOf(this.d), Long.valueOf(this.f9508c)});
    }

    public final String toString() {
        StringBuilder m10 = hg.c.m("NetworkLocationStatus: Wifi status: ", this.f9506a, " Cell status: ", this.f9507b, " elapsed time NS: ");
        m10.append(this.d);
        m10.append(" system time ms: ");
        m10.append(this.f9508c);
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f9506a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f9507b);
        e0.s(parcel, 3, 8);
        parcel.writeLong(this.f9508c);
        e0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        e0.r(parcel, q6);
    }
}
