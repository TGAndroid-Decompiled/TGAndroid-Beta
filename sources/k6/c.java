package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n4.x;
import w7.d0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g8.j(18);
    public final String f14702a;
    public final int f14703b;
    public final long f14704c;

    public c(int i10, String str, long j3) {
        this.f14702a = str;
        this.f14703b = i10;
        this.f14704c = j3;
    }

    public final long b() {
        long j3 = this.f14704c;
        if (j3 == -1) {
            return this.f14703b;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f14702a;
            String str2 = this.f14702a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14702a, Long.valueOf(b())});
    }

    public final String toString() {
        x xVar = new x(this);
        xVar.o(this.f14702a, "name");
        xVar.o(Long.valueOf(b()), "version");
        return xVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f14702a);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f14703b);
        long b10 = b();
        d0.s(parcel, 3, 8);
        parcel.writeLong(b10);
        d0.r(parcel, q6);
    }

    public c(String str, long j3) {
        this.f14702a = str;
        this.f14704c = j3;
        this.f14703b = -1;
    }
}
