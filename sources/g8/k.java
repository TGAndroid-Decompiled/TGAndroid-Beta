package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f9520a;
    public final int f9521b;
    public final long f9522c;
    public final long d;

    public k(long j3, int i10, int i11, long j10) {
        this.f9520a = i10;
        this.f9521b = i11;
        this.f9522c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f9520a == kVar.f9520a && this.f9521b == kVar.f9521b && this.f9522c == kVar.f9522c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9521b), Integer.valueOf(this.f9520a), Long.valueOf(this.d), Long.valueOf(this.f9522c)});
    }

    public final String toString() {
        StringBuilder m10 = hg.c.m("NetworkLocationStatus: Wifi status: ", this.f9520a, " Cell status: ", this.f9521b, " elapsed time NS: ");
        m10.append(this.d);
        m10.append(" system time ms: ");
        m10.append(this.f9522c);
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f9520a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f9521b);
        e0.s(parcel, 3, 8);
        parcel.writeLong(this.f9522c);
        e0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        e0.r(parcel, q6);
    }
}
