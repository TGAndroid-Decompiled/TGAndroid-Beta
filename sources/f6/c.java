package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class c extends r6.a {
    public final long f11395a;
    public final long f11396b;
    public final String f11397c;
    public final String d;
    public final long f11398e;
    public static final j6.b f11394f = new j6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.f11395a = j3;
        this.f11396b = j10;
        this.f11397c = str;
        this.d = str2;
        this.f11398e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11395a == cVar.f11395a && this.f11396b == cVar.f11396b && j6.a.d(this.f11397c, cVar.f11397c) && j6.a.d(this.d, cVar.d) && this.f11398e == cVar.f11398e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11395a), Long.valueOf(this.f11396b), this.f11397c, this.d, Long.valueOf(this.f11398e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.f11395a);
        bc.q(parcel, 3, 8);
        parcel.writeLong(this.f11396b);
        bc.l(parcel, 4, this.f11397c);
        bc.l(parcel, 5, this.d);
        bc.q(parcel, 6, 8);
        parcel.writeLong(this.f11398e);
        bc.s(parcel, r10);
    }
}
