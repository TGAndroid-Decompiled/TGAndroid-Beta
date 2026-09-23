package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n4.y;
import w7.e0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g8.j(18);
    public final String f13494a;
    public final int f13495b;
    public final long f13496c;

    public c(int i10, String str, long j3) {
        this.f13494a = str;
        this.f13495b = i10;
        this.f13496c = j3;
    }

    public final long b() {
        long j3 = this.f13496c;
        if (j3 == -1) {
            return this.f13495b;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f13494a;
            String str2 = this.f13494a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13494a, Long.valueOf(b())});
    }

    public final String toString() {
        y yVar = new y(this);
        yVar.e(this.f13494a, "name");
        yVar.e(Long.valueOf(b()), "version");
        return yVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.f13494a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f13495b);
        long b10 = b();
        e0.s(parcel, 3, 8);
        parcel.writeLong(b10);
        e0.r(parcel, q6);
    }

    public c(String str, long j3) {
        this.f13494a = str;
        this.f13496c = j3;
        this.f13495b = -1;
    }
}
