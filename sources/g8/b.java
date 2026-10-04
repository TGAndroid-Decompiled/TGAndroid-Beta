package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(3);
    public final long f10335a;
    public final int f10336b;
    public final boolean f10337c;
    public final String d;
    public final r7.j f10338e;

    public b(long j3, int i10, boolean z10, String str, r7.j jVar) {
        this.f10335a = j3;
        this.f10336b = i10;
        this.f10337c = z10;
        this.d = str;
        this.f10338e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f10335a != bVar.f10335a || this.f10336b != bVar.f10336b || this.f10337c != bVar.f10337c || !n6.l.l(this.d, bVar.d) || !n6.l.l(this.f10338e, bVar.f10338e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10335a), Integer.valueOf(this.f10336b), Boolean.valueOf(this.f10337c)});
    }

    public final String toString() {
        String str;
        StringBuilder v = a4.a.v("LastLocationRequest[");
        long j3 = this.f10335a;
        if (j3 != Long.MAX_VALUE) {
            v.append("maxAge=");
            r7.p.a(v, j3);
        }
        int i10 = this.f10336b;
        if (i10 != 0) {
            v.append(", ");
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
            v.append(str);
        }
        if (this.f10337c) {
            v.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            v.append(", moduleId=");
            v.append(str2);
        }
        r7.j jVar = this.f10338e;
        if (jVar != null) {
            v.append(", impersonation=");
            v.append(jVar);
        }
        v.append(']');
        return v.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 8);
        parcel.writeLong(this.f10335a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f10336b);
        g0.s(parcel, 3, 4);
        parcel.writeInt(this.f10337c ? 1 : 0);
        g0.l(parcel, 4, this.d);
        g0.k(parcel, 5, this.f10338e, i10);
        g0.r(parcel, q6);
    }
}
