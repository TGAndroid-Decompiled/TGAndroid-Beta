package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n4.y;
import w7.e0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g8.j(18);
    public final String f14811a;
    public final int f14812b;
    public final long f14813c;

    public c(int i10, String str, long j3) {
        this.f14811a = str;
        this.f14812b = i10;
        this.f14813c = j3;
    }

    public final long b() {
        long j3 = this.f14813c;
        if (j3 == -1) {
            return this.f14812b;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f14811a;
            String str2 = this.f14811a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14811a, Long.valueOf(b())});
    }

    public final String toString() {
        y yVar = new y(this);
        yVar.y(this.f14811a, "name");
        yVar.y(Long.valueOf(b()), "version");
        return yVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f14811a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f14812b);
        long b10 = b();
        e0.s(parcel, 3, 8);
        parcel.writeLong(b10);
        e0.r(parcel, q6);
    }

    public c(String str, long j3) {
        this.f14811a = str;
        this.f14813c = j3;
        this.f14812b = -1;
    }
}
