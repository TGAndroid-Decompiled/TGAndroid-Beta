package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(3);
    public final long f10013a;
    public final int f10014b;
    public final boolean f10015c;
    public final String d;
    public final r7.j e;

    public b(long j10, int i10, boolean z10, String str, r7.j jVar) {
        this.f10013a = j10;
        this.f10014b = i10;
        this.f10015c = z10;
        this.d = str;
        this.e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f10013a != bVar.f10013a || this.f10014b != bVar.f10014b || this.f10015c != bVar.f10015c || !n6.l.l(this.d, bVar.d) || !n6.l.l(this.e, bVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10013a), Integer.valueOf(this.f10014b), Boolean.valueOf(this.f10015c)});
    }

    public final String toString() {
        String str;
        StringBuilder u10 = a1.g.u("LastLocationRequest[");
        long j10 = this.f10013a;
        if (j10 != Long.MAX_VALUE) {
            u10.append("maxAge=");
            r7.p.a(u10, j10);
        }
        int i10 = this.f10014b;
        if (i10 != 0) {
            u10.append(", ");
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        str = "GRANULARITY_FINE";
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    str = "GRANULARITY_COARSE";
                }
            } else {
                str = "GRANULARITY_PERMISSION_LEVEL";
            }
            u10.append(str);
        }
        if (this.f10015c) {
            u10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            u10.append(", moduleId=");
            u10.append(str2);
        }
        r7.j jVar = this.e;
        if (jVar != null) {
            u10.append(", impersonation=");
            u10.append(jVar);
        }
        u10.append(']');
        return u10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 8);
        parcel.writeLong(this.f10013a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f10014b);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f10015c ? 1 : 0);
        g0.l(parcel, 4, this.d);
        g0.k(parcel, 5, this.e, i10);
        g0.r(parcel, q6);
    }
}
