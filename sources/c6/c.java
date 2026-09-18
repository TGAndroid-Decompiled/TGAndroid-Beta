package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class c extends o6.a {
    public final long f3964a;
    public final long f3965b;
    public final String f3966c;
    public final String d;
    public final long e;
    public static final g6.b f3963f = new g6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.f3964a = j3;
        this.f3965b = j10;
        this.f3966c = str;
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
        if (this.f3964a == cVar.f3964a && this.f3965b == cVar.f3965b && g6.a.d(this.f3966c, cVar.f3966c) && g6.a.d(this.d, cVar.d) && this.e == cVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3964a), Long.valueOf(this.f3965b), this.f3966c, this.d, Long.valueOf(this.e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 8);
        parcel.writeLong(this.f3964a);
        w7.f0.s(parcel, 3, 8);
        parcel.writeLong(this.f3965b);
        w7.f0.l(parcel, 4, this.f3966c);
        w7.f0.l(parcel, 5, this.d);
        w7.f0.s(parcel, 6, 8);
        parcel.writeLong(this.e);
        w7.f0.r(parcel, q6);
    }
}
