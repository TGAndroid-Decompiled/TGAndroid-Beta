package n6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new m6.e(10);
    public final String f21422a;
    public final int f21423b;
    public final long f21424c;
    public final boolean d;

    public c(String str, int i7, long j3, boolean z10) {
        this.f21422a = str;
        this.f21423b = i7;
        this.f21424c = j3;
        this.d = z10;
    }

    public final long b() {
        long j3 = this.f21424c;
        if (j3 == -1) {
            return this.f21423b;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (q6.m.l(this.f21422a, cVar.f21422a) && b() == cVar.b() && this.d == cVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21422a, Long.valueOf(b()), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        ji.k kVar = new ji.k(this);
        kVar.E(this.f21422a, "name");
        kVar.E(Long.valueOf(b()), "version");
        kVar.E(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return kVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.f21422a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f21423b);
        long b10 = b();
        cc.q(parcel, 3, 8);
        parcel.writeLong(b10);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        cc.s(parcel, r10);
    }

    public c(String str, long j3) {
        this(str, -1, j3, false);
    }
}
