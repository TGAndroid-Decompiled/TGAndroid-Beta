package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m2.t;
import w7.f0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g8.j(18);
    public final String f14167a;
    public final int f14168b;
    public final long f14169c;

    public c(int i10, String str, long j10) {
        this.f14167a = str;
        this.f14168b = i10;
        this.f14169c = j10;
    }

    public final long b() {
        long j10 = this.f14169c;
        if (j10 == -1) {
            return this.f14168b;
        }
        return j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f14167a;
            String str2 = this.f14167a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14167a, Long.valueOf(b())});
    }

    public final String toString() {
        t tVar = new t(this);
        tVar.q(this.f14167a, "name");
        tVar.q(Long.valueOf(b()), "version");
        return tVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f14167a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f14168b);
        long b10 = b();
        f0.s(parcel, 3, 8);
        parcel.writeLong(b10);
        f0.r(parcel, q6);
    }

    public c(String str, long j10) {
        this.f14167a = str;
        this.f14169c = j10;
        this.f14168b = -1;
    }
}
