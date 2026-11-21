package n6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new m6.e(10);
    public final String f21453a;
    public final int f21454b;
    public final long f21455c;
    public final boolean d;

    public c(String str, int i7, long j3, boolean z10) {
        this.f21453a = str;
        this.f21454b = i7;
        this.f21455c = j3;
        this.d = z10;
    }

    public final long b() {
        long j3 = this.f21455c;
        if (j3 == -1) {
            return this.f21454b;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (q6.m.l(this.f21453a, cVar.f21453a) && b() == cVar.b() && this.d == cVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21453a, Long.valueOf(b()), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        ji.l lVar = new ji.l(this);
        lVar.E(this.f21453a, "name");
        lVar.E(Long.valueOf(b()), "version");
        lVar.E(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return lVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f21453a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f21454b);
        long b10 = b();
        bc.q(parcel, 3, 8);
        parcel.writeLong(b10);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.s(parcel, r10);
    }

    public c(String str, long j3) {
        this(str, -1, j3, false);
    }
}
