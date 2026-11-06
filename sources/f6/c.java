package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class c extends r6.a {
    public final long f11232a;
    public final long f11233b;
    public final String f11234c;
    public final String d;
    public final long f11235e;
    public static final j6.b f11231f = new j6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.f11232a = j3;
        this.f11233b = j10;
        this.f11234c = str;
        this.d = str2;
        this.f11235e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11232a == cVar.f11232a && this.f11233b == cVar.f11233b && j6.a.d(this.f11234c, cVar.f11234c) && j6.a.d(this.d, cVar.d) && this.f11235e == cVar.f11235e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11232a), Long.valueOf(this.f11233b), this.f11234c, this.d, Long.valueOf(this.f11235e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 8);
        parcel.writeLong(this.f11232a);
        xb.q(parcel, 3, 8);
        parcel.writeLong(this.f11233b);
        xb.l(parcel, 4, this.f11234c);
        xb.l(parcel, 5, this.d);
        xb.q(parcel, 6, 8);
        parcel.writeLong(this.f11235e);
        xb.s(parcel, r10);
    }
}
