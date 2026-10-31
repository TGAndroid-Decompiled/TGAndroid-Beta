package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;
public final class c extends o6.a {
    public final long f3851a;
    public final long f3852b;
    public final String f3853c;
    public final String d;
    public final long e;
    public static final g6.b f3850f = new g6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j10, long j11, String str, String str2, long j12) {
        this.f3851a = j10;
        this.f3852b = j11;
        this.f3853c = str;
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
        if (this.f3851a == cVar.f3851a && this.f3852b == cVar.f3852b && g6.a.d(this.f3853c, cVar.f3853c) && g6.a.d(this.d, cVar.d) && this.e == cVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3851a), Long.valueOf(this.f3852b), this.f3853c, this.d, Long.valueOf(this.e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 8);
        parcel.writeLong(this.f3851a);
        h0.s(parcel, 3, 8);
        parcel.writeLong(this.f3852b);
        h0.l(parcel, 4, this.f3853c);
        h0.l(parcel, 5, this.d);
        h0.s(parcel, 6, 8);
        parcel.writeLong(this.e);
        h0.r(parcel, q6);
    }
}
