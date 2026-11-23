package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class c extends r6.a {
    public final long f11358a;
    public final long f11359b;
    public final String f11360c;
    public final String d;
    public final long f11361e;
    public static final j6.b f11357f = new j6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.f11358a = j3;
        this.f11359b = j10;
        this.f11360c = str;
        this.d = str2;
        this.f11361e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11358a == cVar.f11358a && this.f11359b == cVar.f11359b && j6.a.d(this.f11360c, cVar.f11360c) && j6.a.d(this.d, cVar.d) && this.f11361e == cVar.f11361e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11358a), Long.valueOf(this.f11359b), this.f11360c, this.d, Long.valueOf(this.f11361e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 8);
        parcel.writeLong(this.f11358a);
        cc.q(parcel, 3, 8);
        parcel.writeLong(this.f11359b);
        cc.l(parcel, 4, this.f11360c);
        cc.l(parcel, 5, this.d);
        cc.q(parcel, 6, 8);
        parcel.writeLong(this.f11361e);
        cc.s(parcel, r10);
    }
}
