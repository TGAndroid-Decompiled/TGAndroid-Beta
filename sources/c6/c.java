package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class c extends o6.a {
    public final long f4822a;
    public final long f4823b;
    public final String f4824c;
    public final String d;
    public final long e;
    public static final g6.b f4821f = new g6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j10, long j11, String str, String str2, long j12) {
        this.f4822a = j10;
        this.f4823b = j11;
        this.f4824c = str;
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
        if (this.f4822a == cVar.f4822a && this.f4823b == cVar.f4823b && g6.a.d(this.f4824c, cVar.f4824c) && g6.a.d(this.d, cVar.d) && this.e == cVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4822a), Long.valueOf(this.f4823b), this.f4824c, this.d, Long.valueOf(this.e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 8);
        parcel.writeLong(this.f4822a);
        w7.f0.s(parcel, 3, 8);
        parcel.writeLong(this.f4823b);
        w7.f0.l(parcel, 4, this.f4824c);
        w7.f0.l(parcel, 5, this.d);
        w7.f0.s(parcel, 6, 8);
        parcel.writeLong(this.e);
        w7.f0.r(parcel, q6);
    }
}
