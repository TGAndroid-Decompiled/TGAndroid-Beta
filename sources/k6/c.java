package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g8.j(18);
    public final String f14164a;
    public final int f14165b;
    public final long f14166c;

    public c(int i10, String str, long j10) {
        this.f14164a = str;
        this.f14165b = i10;
        this.f14166c = j10;
    }

    public final long b() {
        long j10 = this.f14166c;
        if (j10 == -1) {
            return this.f14165b;
        }
        return j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f14164a;
            String str2 = this.f14164a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14164a, Long.valueOf(b())});
    }

    public final String toString() {
        m4.c cVar = new m4.c(this);
        cVar.u(this.f14164a, "name");
        cVar.u(Long.valueOf(b()), "version");
        return cVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.f14164a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f14165b);
        long b10 = b();
        g0.s(parcel, 3, 8);
        parcel.writeLong(b10);
        g0.r(parcel, q6);
    }

    public c(String str, long j10) {
        this.f14164a = str;
        this.f14166c = j10;
        this.f14165b = -1;
    }
}
