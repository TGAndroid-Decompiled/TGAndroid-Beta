package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g8.j(18);
    public final String f12350a;
    public final int f12351b;
    public final long f12352c;

    public c(int i10, String str, long j3) {
        this.f12350a = str;
        this.f12351b = i10;
        this.f12352c = j3;
    }

    public final long b() {
        long j3 = this.f12352c;
        if (j3 == -1) {
            return this.f12351b;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f12350a;
            String str2 = this.f12350a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12350a, Long.valueOf(b())});
    }

    public final String toString() {
        of.b bVar = new of.b(this);
        bVar.E(this.f12350a, "name");
        bVar.E(Long.valueOf(b()), "version");
        return bVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f12350a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f12351b);
        long b10 = b();
        e0.s(parcel, 3, 8);
        parcel.writeLong(b10);
        e0.r(parcel, q6);
    }

    public c(String str, long j3) {
        this.f12350a = str;
        this.f12352c = j3;
        this.f12351b = -1;
    }
}
