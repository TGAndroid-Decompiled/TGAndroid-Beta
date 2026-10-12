package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class c extends o6.a {
    public final long f4327a;
    public final long f4328b;
    public final String f4329c;
    public final String d;
    public final long f4330e;
    public static final g6.b f4326f = new g6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.f4327a = j3;
        this.f4328b = j10;
        this.f4329c = str;
        this.d = str2;
        this.f4330e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4327a == cVar.f4327a && this.f4328b == cVar.f4328b && g6.a.d(this.f4329c, cVar.f4329c) && g6.a.d(this.d, cVar.d) && this.f4330e == cVar.f4330e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4327a), Long.valueOf(this.f4328b), this.f4329c, this.d, Long.valueOf(this.f4330e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 8);
        parcel.writeLong(this.f4327a);
        w7.c0.s(parcel, 3, 8);
        parcel.writeLong(this.f4328b);
        w7.c0.l(parcel, 4, this.f4329c);
        w7.c0.l(parcel, 5, this.d);
        w7.c0.s(parcel, 6, 8);
        parcel.writeLong(this.f4330e);
        w7.c0.r(parcel, q6);
    }
}
