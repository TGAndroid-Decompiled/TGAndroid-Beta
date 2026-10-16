package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f10030a;
    public final int f10031b;
    public final long f10032c;
    public final long d;

    public k(long j10, int i10, int i11, long j11) {
        this.f10030a = i10;
        this.f10031b = i11;
        this.f10032c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f10030a == kVar.f10030a && this.f10031b == kVar.f10031b && this.f10032c == kVar.f10032c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10031b), Integer.valueOf(this.f10030a), Long.valueOf(this.d), Long.valueOf(this.f10032c)});
    }

    public final String toString() {
        StringBuilder m10 = i2.d.m("NetworkLocationStatus: Wifi status: ", this.f10030a, " Cell status: ", this.f10031b, " elapsed time NS: ");
        m10.append(this.d);
        m10.append(" system time ms: ");
        m10.append(this.f10032c);
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f10030a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f10031b);
        f0.s(parcel, 3, 8);
        parcel.writeLong(this.f10032c);
        f0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        f0.r(parcel, q6);
    }
}
