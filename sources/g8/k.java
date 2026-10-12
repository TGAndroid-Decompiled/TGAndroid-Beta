package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.c0;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int f10422a;
    public final int f10423b;
    public final long f10424c;
    public final long d;

    public k(long j3, int i10, int i11, long j10) {
        this.f10422a = i10;
        this.f10423b = i11;
        this.f10424c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f10422a == kVar.f10422a && this.f10423b == kVar.f10423b && this.f10424c == kVar.f10424c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10423b), Integer.valueOf(this.f10422a), Long.valueOf(this.d), Long.valueOf(this.f10424c)});
    }

    public final String toString() {
        StringBuilder m10 = hg.c.m("NetworkLocationStatus: Wifi status: ", this.f10422a, " Cell status: ", this.f10423b, " elapsed time NS: ");
        m10.append(this.d);
        m10.append(" system time ms: ");
        m10.append(this.f10424c);
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 4);
        parcel.writeInt(this.f10422a);
        c0.s(parcel, 2, 4);
        parcel.writeInt(this.f10423b);
        c0.s(parcel, 3, 8);
        parcel.writeLong(this.f10424c);
        c0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        c0.r(parcel, q6);
    }
}
