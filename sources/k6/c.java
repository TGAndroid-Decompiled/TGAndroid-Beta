package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n4.y;
import w7.g0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g8.j(18);
    public final String f14670a;
    public final int f14671b;
    public final long f14672c;

    public c(int i10, String str, long j3) {
        this.f14670a = str;
        this.f14671b = i10;
        this.f14672c = j3;
    }

    public final long b() {
        long j3 = this.f14672c;
        if (j3 == -1) {
            return this.f14671b;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f14670a;
            String str2 = this.f14670a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14670a, Long.valueOf(b())});
    }

    public final String toString() {
        y yVar = new y(this);
        yVar.m(this.f14670a, "name");
        yVar.m(Long.valueOf(b()), "version");
        return yVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f14670a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f14671b);
        long b10 = b();
        g0.s(parcel, 3, 8);
        parcel.writeLong(b10);
        g0.r(parcel, q6);
    }

    public c(String str, long j3) {
        this.f14670a = str;
        this.f14672c = j3;
        this.f14671b = -1;
    }
}
