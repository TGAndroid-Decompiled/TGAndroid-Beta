package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n4.y;
import w7.e0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g8.j(18);
    public final String f13507a;
    public final int f13508b;
    public final long f13509c;

    public c(int i10, String str, long j3) {
        this.f13507a = str;
        this.f13508b = i10;
        this.f13509c = j3;
    }

    public final long b() {
        long j3 = this.f13509c;
        if (j3 == -1) {
            return this.f13508b;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f13507a;
            String str2 = this.f13507a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13507a, Long.valueOf(b())});
    }

    public final String toString() {
        y yVar = new y(this);
        yVar.e(this.f13507a, "name");
        yVar.e(Long.valueOf(b()), "version");
        return yVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f13507a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f13508b);
        long b10 = b();
        e0.s(parcel, 3, 8);
        parcel.writeLong(b10);
        e0.r(parcel, q6);
    }

    public c(String str, long j3) {
        this.f13507a = str;
        this.f13509c = j3;
        this.f13508b = -1;
    }
}
