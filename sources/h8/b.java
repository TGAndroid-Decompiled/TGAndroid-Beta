package h8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(3);
    public final long f12699a;
    public final int f12700b;
    public final boolean f12701c;
    public final String d;
    public final s7.j e;

    public b(long j10, int i10, boolean z10, String str, s7.j jVar) {
        this.f12699a = j10;
        this.f12700b = i10;
        this.f12701c = z10;
        this.d = str;
        this.e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f12699a != bVar.f12699a || this.f12700b != bVar.f12700b || this.f12701c != bVar.f12701c || !o6.l.l(this.d, bVar.d) || !o6.l.l(this.e, bVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f12699a), Integer.valueOf(this.f12700b), Boolean.valueOf(this.f12701c)});
    }

    public final String toString() {
        String str;
        StringBuilder u10 = a1.g.u("LastLocationRequest[");
        long j10 = this.f12699a;
        if (j10 != Long.MAX_VALUE) {
            u10.append("maxAge=");
            s7.p.a(u10, j10);
        }
        int i10 = this.f12700b;
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
        if (this.f12701c) {
            u10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            u10.append(", moduleId=");
            u10.append(str2);
        }
        s7.j jVar = this.e;
        if (jVar != null) {
            u10.append(", impersonation=");
            u10.append(jVar);
        }
        u10.append(']');
        return u10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 8);
        parcel.writeLong(this.f12699a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f12700b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f12701c ? 1 : 0);
        df.l(parcel, 4, this.d);
        df.k(parcel, 5, this.e, i10);
        df.r(parcel, q5);
    }
}
