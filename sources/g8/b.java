package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(3);
    public final long f10334a;
    public final int f10335b;
    public final boolean f10336c;
    public final String d;
    public final r7.j f10337e;

    public b(long j3, int i10, boolean z10, String str, r7.j jVar) {
        this.f10334a = j3;
        this.f10335b = i10;
        this.f10336c = z10;
        this.d = str;
        this.f10337e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f10334a != bVar.f10334a || this.f10335b != bVar.f10335b || this.f10336c != bVar.f10336c || !n6.l.l(this.d, bVar.d) || !n6.l.l(this.f10337e, bVar.f10337e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10334a), Integer.valueOf(this.f10335b), Boolean.valueOf(this.f10336c)});
    }

    public final String toString() {
        String str;
        StringBuilder u10 = a4.a.u("LastLocationRequest[");
        long j3 = this.f10334a;
        if (j3 != Long.MAX_VALUE) {
            u10.append("maxAge=");
            r7.p.a(u10, j3);
        }
        int i10 = this.f10335b;
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
        if (this.f10336c) {
            u10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            u10.append(", moduleId=");
            u10.append(str2);
        }
        r7.j jVar = this.f10337e;
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
        parcel.writeLong(this.f10334a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f10335b);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f10336c ? 1 : 0);
        g0.l(parcel, 4, this.d);
        g0.k(parcel, 5, this.f10337e, i10);
        g0.r(parcel, q6);
    }
}
