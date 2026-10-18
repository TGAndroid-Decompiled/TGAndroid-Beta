package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f10936a;
    public final int f10937b;
    public final long f10938c;
    public final long d;

    public k(long j10, int i10, int i11, long j11) {
        this.f10936a = i10;
        this.f10937b = i11;
        this.f10938c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f10936a == kVar.f10936a && this.f10937b == kVar.f10937b && this.f10938c == kVar.f10938c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10937b), Integer.valueOf(this.f10936a), Long.valueOf(this.d), Long.valueOf(this.f10938c)});
    }

    public final String toString() {
        StringBuilder m10 = i2.d.m("NetworkLocationStatus: Wifi status: ", this.f10936a, " Cell status: ", this.f10937b, " elapsed time NS: ");
        m10.append(this.d);
        m10.append(" system time ms: ");
        m10.append(this.f10938c);
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f10936a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f10937b);
        f0.s(parcel, 3, 8);
        parcel.writeLong(this.f10938c);
        f0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        f0.r(parcel, q6);
    }
}
