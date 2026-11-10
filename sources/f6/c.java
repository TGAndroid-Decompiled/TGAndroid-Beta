package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class c extends r6.a {
    public final long f11237a;
    public final long f11238b;
    public final String f11239c;
    public final String d;
    public final long f11240e;
    public static final j6.b f11236f = new j6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.f11237a = j3;
        this.f11238b = j10;
        this.f11239c = str;
        this.d = str2;
        this.f11240e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11237a == cVar.f11237a && this.f11238b == cVar.f11238b && j6.a.d(this.f11239c, cVar.f11239c) && j6.a.d(this.d, cVar.d) && this.f11240e == cVar.f11240e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11237a), Long.valueOf(this.f11238b), this.f11239c, this.d, Long.valueOf(this.f11240e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 8);
        parcel.writeLong(this.f11237a);
        xb.q(parcel, 3, 8);
        parcel.writeLong(this.f11238b);
        xb.l(parcel, 4, this.f11239c);
        xb.l(parcel, 5, this.d);
        xb.q(parcel, 6, 8);
        parcel.writeLong(this.f11240e);
        xb.s(parcel, r10);
    }
}
