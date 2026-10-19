package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f10937a;
    public final int f10938b;
    public final long f10939c;
    public final long d;

    public k(long j10, int i10, int i11, long j11) {
        this.f10937a = i10;
        this.f10938b = i11;
        this.f10939c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f10937a == kVar.f10937a && this.f10938b == kVar.f10938b && this.f10939c == kVar.f10939c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10938b), Integer.valueOf(this.f10937a), Long.valueOf(this.d), Long.valueOf(this.f10939c)});
    }

    public final String toString() {
        StringBuilder m10 = i2.e.m("NetworkLocationStatus: Wifi status: ", this.f10937a, " Cell status: ", this.f10938b, " elapsed time NS: ");
        m10.append(this.d);
        m10.append(" system time ms: ");
        m10.append(this.f10939c);
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f10937a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f10938b);
        f0.s(parcel, 3, 8);
        parcel.writeLong(this.f10939c);
        f0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        f0.r(parcel, q6);
    }
}
