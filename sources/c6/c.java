package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class c extends o6.a {
    public final long f4449a;
    public final long f4450b;
    public final String f4451c;
    public final String d;
    public final long e;
    public static final g6.b f4448f = new g6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j10, long j11, String str, String str2, long j12) {
        this.f4449a = j10;
        this.f4450b = j11;
        this.f4451c = str;
        this.d = str2;
        this.e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4449a == cVar.f4449a && this.f4450b == cVar.f4450b && g6.a.d(this.f4451c, cVar.f4451c) && g6.a.d(this.d, cVar.d) && this.e == cVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4449a), Long.valueOf(this.f4450b), this.f4451c, this.d, Long.valueOf(this.e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f4449a);
        g0.s(parcel, 3, 8);
        parcel.writeLong(this.f4450b);
        g0.l(parcel, 4, this.f4451c);
        g0.l(parcel, 5, this.d);
        g0.s(parcel, 6, 8);
        parcel.writeLong(this.e);
        g0.r(parcel, q6);
    }
}
