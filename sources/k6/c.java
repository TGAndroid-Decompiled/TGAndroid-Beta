package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import mi.q;
import w7.f0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g8.j(18);
    public final String f14967a;
    public final int f14968b;
    public final long f14969c;

    public c(int i10, String str, long j10) {
        this.f14967a = str;
        this.f14968b = i10;
        this.f14969c = j10;
    }

    public final long b() {
        long j10 = this.f14969c;
        if (j10 == -1) {
            return this.f14968b;
        }
        return j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f14967a;
            String str2 = this.f14967a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14967a, Long.valueOf(b())});
    }

    public final String toString() {
        q qVar = new q(this);
        qVar.H(this.f14967a, "name");
        qVar.H(Long.valueOf(b()), "version");
        return qVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 1, this.f14967a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f14968b);
        long b10 = b();
        f0.s(parcel, 3, 8);
        parcel.writeLong(b10);
        f0.r(parcel, q6);
    }

    public c(String str, long j10) {
        this.f14967a = str;
        this.f14969c = j10;
        this.f14968b = -1;
    }
}
