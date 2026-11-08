package n6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new m6.e(10);
    public final String f20495a;
    public final int f20496b;
    public final long f20497c;
    public final boolean d;

    public c(String str, int i7, long j3, boolean z9) {
        this.f20495a = str;
        this.f20496b = i7;
        this.f20497c = j3;
        this.d = z9;
    }

    public final long b() {
        long j3 = this.f20497c;
        if (j3 == -1) {
            return this.f20496b;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (q6.m.k(this.f20495a, cVar.f20495a) && b() == cVar.b() && this.d == cVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20495a, Long.valueOf(b()), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        j2.n nVar = new j2.n(this);
        nVar.X(this.f20495a, "name");
        nVar.X(Long.valueOf(b()), "version");
        nVar.X(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return nVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f20495a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f20496b);
        long b10 = b();
        xb.q(parcel, 3, 8);
        parcel.writeLong(b10);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        xb.s(parcel, r10);
    }

    public c(String str, long j3) {
        this(str, -1, j3, false);
    }
}
