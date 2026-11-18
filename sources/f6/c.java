package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class c extends r6.a {
    public final long f11363a;
    public final long f11364b;
    public final String f11365c;
    public final String d;
    public final long f11366e;
    public static final j6.b f11362f = new j6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.f11363a = j3;
        this.f11364b = j10;
        this.f11365c = str;
        this.d = str2;
        this.f11366e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11363a == cVar.f11363a && this.f11364b == cVar.f11364b && j6.a.d(this.f11365c, cVar.f11365c) && j6.a.d(this.d, cVar.d) && this.f11366e == cVar.f11366e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11363a), Long.valueOf(this.f11364b), this.f11365c, this.d, Long.valueOf(this.f11366e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.f11363a);
        bc.q(parcel, 3, 8);
        parcel.writeLong(this.f11364b);
        bc.l(parcel, 4, this.f11365c);
        bc.l(parcel, 5, this.d);
        bc.q(parcel, 6, 8);
        parcel.writeLong(this.f11366e);
        bc.s(parcel, r10);
    }
}
