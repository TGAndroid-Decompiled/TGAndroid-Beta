package m6;

import android.os.Parcel;
import android.os.Parcelable;
import i7.p;
import java.util.Arrays;
import m2.t;
public final class c extends q6.a {
    public static final Parcelable.Creator<c> CREATOR = new p(25);
    public final String f19183a;
    public final int f19184b;
    public final long f19185c;
    public final boolean d;

    public c(String str, int i3, long j10, boolean z10) {
        this.f19183a = str;
        this.f19184b = i3;
        this.f19185c = j10;
        this.d = z10;
    }

    public final long b() {
        long j10 = this.f19185c;
        if (j10 == -1) {
            return this.f19184b;
        }
        return j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (p6.m.k(this.f19183a, cVar.f19183a) && b() == cVar.b() && this.d == cVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19183a, Long.valueOf(b()), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        t tVar = new t(this);
        tVar.A(this.f19183a, "name");
        tVar.A(Long.valueOf(b()), "version");
        tVar.A(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return tVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.f19183a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f19184b);
        long b10 = b();
        j8.a.r(parcel, 3, 8);
        parcel.writeLong(b10);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j8.a.t(parcel, s6);
    }

    public c(String str, long j10) {
        this(str, -1, j10, false);
    }
}
