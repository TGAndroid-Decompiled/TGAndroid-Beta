package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class c extends o6.a {
    public final long f4472a;
    public final long f4473b;
    public final String f4474c;
    public final String d;
    public final long f4475e;
    public static final g6.b f4471f = new g6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.f4472a = j3;
        this.f4473b = j10;
        this.f4474c = str;
        this.d = str2;
        this.f4475e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4472a == cVar.f4472a && this.f4473b == cVar.f4473b && g6.a.d(this.f4474c, cVar.f4474c) && g6.a.d(this.d, cVar.d) && this.f4475e == cVar.f4475e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4472a), Long.valueOf(this.f4473b), this.f4474c, this.d, Long.valueOf(this.f4475e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 8);
        parcel.writeLong(this.f4472a);
        w7.e0.s(parcel, 3, 8);
        parcel.writeLong(this.f4473b);
        w7.e0.l(parcel, 4, this.f4474c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.s(parcel, 6, 8);
        parcel.writeLong(this.f4475e);
        w7.e0.r(parcel, q6);
    }
}
