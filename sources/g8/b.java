package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(3);
    public final long f10922a;
    public final int f10923b;
    public final boolean f10924c;
    public final String d;
    public final r7.j e;

    public b(long j10, int i10, boolean z10, String str, r7.j jVar) {
        this.f10922a = j10;
        this.f10923b = i10;
        this.f10924c = z10;
        this.d = str;
        this.e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f10922a != bVar.f10922a || this.f10923b != bVar.f10923b || this.f10924c != bVar.f10924c || !n6.l.l(this.d, bVar.d) || !n6.l.l(this.e, bVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10922a), Integer.valueOf(this.f10923b), Boolean.valueOf(this.f10924c)});
    }

    public final String toString() {
        String str;
        StringBuilder u10 = a1.g.u("LastLocationRequest[");
        long j10 = this.f10922a;
        if (j10 != Long.MAX_VALUE) {
            u10.append("maxAge=");
            r7.p.a(u10, j10);
        }
        int i10 = this.f10923b;
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
        if (this.f10924c) {
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
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 8);
        parcel.writeLong(this.f10922a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f10923b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f10924c ? 1 : 0);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.r(parcel, q6);
    }
}
