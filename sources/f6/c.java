package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class c extends r6.a {
    public final long f11046a;
    public final long f11047b;
    public final String f11048c;
    public final String d;
    public final long f11049e;
    public static final j6.b f11045f = new j6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.f11046a = j3;
        this.f11047b = j10;
        this.f11048c = str;
        this.d = str2;
        this.f11049e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11046a == cVar.f11046a && this.f11047b == cVar.f11047b && j6.a.d(this.f11048c, cVar.f11048c) && j6.a.d(this.d, cVar.d) && this.f11049e == cVar.f11049e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11046a), Long.valueOf(this.f11047b), this.f11048c, this.d, Long.valueOf(this.f11049e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 8);
        parcel.writeLong(this.f11046a);
        yb.q(parcel, 3, 8);
        parcel.writeLong(this.f11047b);
        yb.l(parcel, 4, this.f11048c);
        yb.l(parcel, 5, this.d);
        yb.q(parcel, 6, 8);
        parcel.writeLong(this.f11049e);
        yb.s(parcel, r10);
    }
}
