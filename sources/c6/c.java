package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class c extends o6.a {
    public final long f4825a;
    public final long f4826b;
    public final String f4827c;
    public final String d;
    public final long e;
    public static final g6.b f4824f = new g6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j10, long j11, String str, String str2, long j12) {
        this.f4825a = j10;
        this.f4826b = j11;
        this.f4827c = str;
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
        if (this.f4825a == cVar.f4825a && this.f4826b == cVar.f4826b && g6.a.d(this.f4827c, cVar.f4827c) && g6.a.d(this.d, cVar.d) && this.e == cVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4825a), Long.valueOf(this.f4826b), this.f4827c, this.d, Long.valueOf(this.e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 8);
        parcel.writeLong(this.f4825a);
        w7.f0.s(parcel, 3, 8);
        parcel.writeLong(this.f4826b);
        w7.f0.l(parcel, 4, this.f4827c);
        w7.f0.l(parcel, 5, this.d);
        w7.f0.s(parcel, 6, 8);
        parcel.writeLong(this.e);
        w7.f0.r(parcel, q6);
    }
}
