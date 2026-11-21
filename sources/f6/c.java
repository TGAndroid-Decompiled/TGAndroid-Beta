package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class c extends r6.a {
    public final long f11392a;
    public final long f11393b;
    public final String f11394c;
    public final String d;
    public final long f11395e;
    public static final j6.b f11391f = new j6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.f11392a = j3;
        this.f11393b = j10;
        this.f11394c = str;
        this.d = str2;
        this.f11395e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11392a == cVar.f11392a && this.f11393b == cVar.f11393b && j6.a.d(this.f11394c, cVar.f11394c) && j6.a.d(this.d, cVar.d) && this.f11395e == cVar.f11395e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11392a), Long.valueOf(this.f11393b), this.f11394c, this.d, Long.valueOf(this.f11395e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.f11392a);
        bc.q(parcel, 3, 8);
        parcel.writeLong(this.f11393b);
        bc.l(parcel, 4, this.f11394c);
        bc.l(parcel, 5, this.d);
        bc.q(parcel, 6, 8);
        parcel.writeLong(this.f11395e);
        bc.s(parcel, r10);
    }
}
