package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f10938a;
    public final int f10939b;
    public final long f10940c;
    public final long d;

    public k(long j10, int i10, int i11, long j11) {
        this.f10938a = i10;
        this.f10939b = i11;
        this.f10940c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f10938a == kVar.f10938a && this.f10939b == kVar.f10939b && this.f10940c == kVar.f10940c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10939b), Integer.valueOf(this.f10938a), Long.valueOf(this.d), Long.valueOf(this.f10940c)});
    }

    public final String toString() {
        StringBuilder m10 = i2.d.m("NetworkLocationStatus: Wifi status: ", this.f10938a, " Cell status: ", this.f10939b, " elapsed time NS: ");
        m10.append(this.d);
        m10.append(" system time ms: ");
        m10.append(this.f10940c);
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f10938a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f10939b);
        f0.s(parcel, 3, 8);
        parcel.writeLong(this.f10940c);
        f0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        f0.r(parcel, q6);
    }
}
