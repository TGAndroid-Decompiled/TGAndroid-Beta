package i8;

import android.os.Parcel;
import android.os.Parcelable;
import i7.p;
import java.util.Arrays;
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new p(5);
    public final int f14707a;
    public final int f14708b;
    public final long f14709c;
    public final long d;

    public g(long j10, long j11, int i3, int i10) {
        this.f14707a = i3;
        this.f14708b = i10;
        this.f14709c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f14707a == gVar.f14707a && this.f14708b == gVar.f14708b && this.f14709c == gVar.f14709c && this.d == gVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14708b), Integer.valueOf(this.f14707a), Long.valueOf(this.d), Long.valueOf(this.f14709c)});
    }

    public final String toString() {
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("NetworkLocationStatus: Wifi status: ", this.f14707a, " Cell status: ", this.f14708b, " elapsed time NS: ");
        m10.append(this.d);
        m10.append(" system time ms: ");
        m10.append(this.f14709c);
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f14707a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f14708b);
        j8.a.r(parcel, 3, 8);
        parcel.writeLong(this.f14709c);
        j8.a.r(parcel, 4, 8);
        parcel.writeLong(this.d);
        j8.a.t(parcel, s6);
    }
}
