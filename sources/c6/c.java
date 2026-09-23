package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class c extends o6.a {
    public final long f3956a;
    public final long f3957b;
    public final String f3958c;
    public final String d;
    public final long e;
    public static final g6.b f3955f = new g6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.f3956a = j3;
        this.f3957b = j10;
        this.f3958c = str;
        this.d = str2;
        this.e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3956a == cVar.f3956a && this.f3957b == cVar.f3957b && g6.a.d(this.f3958c, cVar.f3958c) && g6.a.d(this.d, cVar.d) && this.e == cVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3956a), Long.valueOf(this.f3957b), this.f3958c, this.d, Long.valueOf(this.e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 8);
        parcel.writeLong(this.f3956a);
        w7.e0.s(parcel, 3, 8);
        parcel.writeLong(this.f3957b);
        w7.e0.l(parcel, 4, this.f3958c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.s(parcel, 6, 8);
        parcel.writeLong(this.e);
        w7.e0.r(parcel, q6);
    }
}
