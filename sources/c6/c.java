package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class c extends o6.a {
    public final long f4499a;
    public final long f4500b;
    public final String f4501c;
    public final String d;
    public final long f4502e;
    public static final g6.b f4498f = new g6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.f4499a = j3;
        this.f4500b = j10;
        this.f4501c = str;
        this.d = str2;
        this.f4502e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4499a == cVar.f4499a && this.f4500b == cVar.f4500b && g6.a.d(this.f4501c, cVar.f4501c) && g6.a.d(this.d, cVar.d) && this.f4502e == cVar.f4502e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4499a), Long.valueOf(this.f4500b), this.f4501c, this.d, Long.valueOf(this.f4502e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 8);
        parcel.writeLong(this.f4499a);
        w7.e0.s(parcel, 3, 8);
        parcel.writeLong(this.f4500b);
        w7.e0.l(parcel, 4, this.f4501c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.s(parcel, 6, 8);
        parcel.writeLong(this.f4502e);
        w7.e0.r(parcel, q6);
    }
}
