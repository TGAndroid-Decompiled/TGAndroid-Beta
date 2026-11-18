package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class c extends r6.a {
    public final long f11366a;
    public final long f11367b;
    public final String f11368c;
    public final String d;
    public final long f11369e;
    public static final j6.b f11365f = new j6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.f11366a = j3;
        this.f11367b = j10;
        this.f11368c = str;
        this.d = str2;
        this.f11369e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11366a == cVar.f11366a && this.f11367b == cVar.f11367b && j6.a.d(this.f11368c, cVar.f11368c) && j6.a.d(this.d, cVar.d) && this.f11369e == cVar.f11369e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11366a), Long.valueOf(this.f11367b), this.f11368c, this.d, Long.valueOf(this.f11369e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.f11366a);
        bc.q(parcel, 3, 8);
        parcel.writeLong(this.f11367b);
        bc.l(parcel, 4, this.f11368c);
        bc.l(parcel, 5, this.d);
        bc.q(parcel, 6, 8);
        parcel.writeLong(this.f11369e);
        bc.s(parcel, r10);
    }
}
