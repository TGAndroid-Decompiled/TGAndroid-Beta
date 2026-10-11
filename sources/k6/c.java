package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.d0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g8.j(18);
    public final String f14701a;
    public final int f14702b;
    public final long f14703c;

    public c(int i10, String str, long j3) {
        this.f14701a = str;
        this.f14702b = i10;
        this.f14703c = j3;
    }

    public final long b() {
        long j3 = this.f14703c;
        if (j3 == -1) {
            return this.f14702b;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f14701a;
            String str2 = this.f14701a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14701a, Long.valueOf(b())});
    }

    public final String toString() {
        n6.k kVar = new n6.k(this);
        kVar.m(this.f14701a, "name");
        kVar.m(Long.valueOf(b()), "version");
        return kVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.f14701a);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f14702b);
        long b10 = b();
        d0.s(parcel, 3, 8);
        parcel.writeLong(b10);
        d0.r(parcel, q6);
    }

    public c(String str, long j3) {
        this.f14701a = str;
        this.f14703c = j3;
        this.f14702b = -1;
    }
}
