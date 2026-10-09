package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class c extends o6.a {
    public final long f4329a;
    public final long f4330b;
    public final String f4331c;
    public final String d;
    public final long f4332e;
    public static final g6.b f4328f = new g6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.f4329a = j3;
        this.f4330b = j10;
        this.f4331c = str;
        this.d = str2;
        this.f4332e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4329a == cVar.f4329a && this.f4330b == cVar.f4330b && g6.a.d(this.f4331c, cVar.f4331c) && g6.a.d(this.d, cVar.d) && this.f4332e == cVar.f4332e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4329a), Long.valueOf(this.f4330b), this.f4331c, this.d, Long.valueOf(this.f4332e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 2, 8);
        parcel.writeLong(this.f4329a);
        w7.d0.s(parcel, 3, 8);
        parcel.writeLong(this.f4330b);
        w7.d0.l(parcel, 4, this.f4331c);
        w7.d0.l(parcel, 5, this.d);
        w7.d0.s(parcel, 6, 8);
        parcel.writeLong(this.f4332e);
        w7.d0.r(parcel, q6);
    }
}
