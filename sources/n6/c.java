package n6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new m6.e(10);
    public final String f21064a;
    public final int f21065b;
    public final long f21066c;
    public final boolean d;

    public c(String str, int i7, long j3, boolean z10) {
        this.f21064a = str;
        this.f21065b = i7;
        this.f21066c = j3;
        this.d = z10;
    }

    public final long b() {
        long j3 = this.f21066c;
        if (j3 == -1) {
            return this.f21065b;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (q6.m.k(this.f21064a, cVar.f21064a) && b() == cVar.b() && this.d == cVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21064a, Long.valueOf(b()), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        ji.j jVar = new ji.j(this);
        jVar.U(this.f21064a, "name");
        jVar.U(Long.valueOf(b()), "version");
        jVar.U(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return jVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.f21064a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f21065b);
        long b10 = b();
        yb.q(parcel, 3, 8);
        parcel.writeLong(b10);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        yb.s(parcel, r10);
    }

    public c(String str, long j3) {
        this(str, -1, j3, false);
    }
}
