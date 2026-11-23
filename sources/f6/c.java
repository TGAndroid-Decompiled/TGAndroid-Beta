package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class c extends r6.a {
    public final long f11357a;
    public final long f11358b;
    public final String f11359c;
    public final String d;
    public final long f11360e;
    public static final j6.b f11356f = new j6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.f11357a = j3;
        this.f11358b = j10;
        this.f11359c = str;
        this.d = str2;
        this.f11360e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11357a == cVar.f11357a && this.f11358b == cVar.f11358b && j6.a.d(this.f11359c, cVar.f11359c) && j6.a.d(this.d, cVar.d) && this.f11360e == cVar.f11360e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11357a), Long.valueOf(this.f11358b), this.f11359c, this.d, Long.valueOf(this.f11360e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 8);
        parcel.writeLong(this.f11357a);
        cc.q(parcel, 3, 8);
        parcel.writeLong(this.f11358b);
        cc.l(parcel, 4, this.f11359c);
        cc.l(parcel, 5, this.d);
        cc.q(parcel, 6, 8);
        parcel.writeLong(this.f11360e);
        cc.s(parcel, r10);
    }
}
