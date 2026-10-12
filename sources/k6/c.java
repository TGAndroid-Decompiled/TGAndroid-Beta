package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.c0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g8.j(18);
    public final String f14699a;
    public final int f14700b;
    public final long f14701c;

    public c(int i10, String str, long j3) {
        this.f14699a = str;
        this.f14700b = i10;
        this.f14701c = j3;
    }

    public final long b() {
        long j3 = this.f14701c;
        if (j3 == -1) {
            return this.f14700b;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f14699a;
            String str2 = this.f14699a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14699a, Long.valueOf(b())});
    }

    public final String toString() {
        n6.k kVar = new n6.k(this);
        kVar.d(this.f14699a, "name");
        kVar.d(Long.valueOf(b()), "version");
        return kVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 1, this.f14699a);
        c0.s(parcel, 2, 4);
        parcel.writeInt(this.f14700b);
        long b10 = b();
        c0.s(parcel, 3, 8);
        parcel.writeLong(b10);
        c0.r(parcel, q6);
    }

    public c(String str, long j3) {
        this.f14699a = str;
        this.f14701c = j3;
        this.f14700b = -1;
    }
}
