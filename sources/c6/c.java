package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class c extends o6.a {
    public final long f4378a;
    public final long f4379b;
    public final String f4380c;
    public final String d;
    public final long e;
    public static final g6.b f4377f = new g6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.f4378a = j3;
        this.f4379b = j10;
        this.f4380c = str;
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
        if (this.f4378a == cVar.f4378a && this.f4379b == cVar.f4379b && g6.a.d(this.f4380c, cVar.f4380c) && g6.a.d(this.d, cVar.d) && this.e == cVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4378a), Long.valueOf(this.f4379b), this.f4380c, this.d, Long.valueOf(this.e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 8);
        parcel.writeLong(this.f4378a);
        w7.e0.s(parcel, 3, 8);
        parcel.writeLong(this.f4379b);
        w7.e0.l(parcel, 4, this.f4380c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.s(parcel, 6, 8);
        parcel.writeLong(this.e);
        w7.e0.r(parcel, q6);
    }
}
