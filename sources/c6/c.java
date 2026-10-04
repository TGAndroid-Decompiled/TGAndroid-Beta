package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class c extends o6.a {
    public final long f4278a;
    public final long f4279b;
    public final String f4280c;
    public final String d;
    public final long f4281e;
    public static final g6.b f4277f = new g6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.f4278a = j3;
        this.f4279b = j10;
        this.f4280c = str;
        this.d = str2;
        this.f4281e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4278a == cVar.f4278a && this.f4279b == cVar.f4279b && g6.a.d(this.f4280c, cVar.f4280c) && g6.a.d(this.d, cVar.d) && this.f4281e == cVar.f4281e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4278a), Long.valueOf(this.f4279b), this.f4280c, this.d, Long.valueOf(this.f4281e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f4278a);
        g0.s(parcel, 3, 8);
        parcel.writeLong(this.f4279b);
        g0.l(parcel, 4, this.f4280c);
        g0.l(parcel, 5, this.d);
        g0.s(parcel, 6, 8);
        parcel.writeLong(this.f4281e);
        g0.r(parcel, q6);
    }
}
