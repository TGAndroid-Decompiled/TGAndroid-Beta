package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.d0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(3);
    public final long f10408a;
    public final int f10409b;
    public final boolean f10410c;
    public final String d;
    public final r7.j f10411e;

    public b(long j3, int i10, boolean z10, String str, r7.j jVar) {
        this.f10408a = j3;
        this.f10409b = i10;
        this.f10410c = z10;
        this.d = str;
        this.f10411e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f10408a != bVar.f10408a || this.f10409b != bVar.f10409b || this.f10410c != bVar.f10410c || !n6.l.l(this.d, bVar.d) || !n6.l.l(this.f10411e, bVar.f10411e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10408a), Integer.valueOf(this.f10409b), Boolean.valueOf(this.f10410c)});
    }

    public final String toString() {
        String str;
        StringBuilder v = a1.g.v("LastLocationRequest[");
        long j3 = this.f10408a;
        if (j3 != Long.MAX_VALUE) {
            v.append("maxAge=");
            r7.p.a(v, j3);
        }
        int i10 = this.f10409b;
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
        if (this.f10410c) {
            v.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            v.append(", moduleId=");
            v.append(str2);
        }
        r7.j jVar = this.f10411e;
        if (jVar != null) {
            v.append(", impersonation=");
            v.append(jVar);
        }
        v.append(']');
        return v.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 1, 8);
        parcel.writeLong(this.f10408a);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.f10409b);
        d0.s(parcel, 3, 4);
        parcel.writeInt(this.f10410c ? 1 : 0);
        d0.l(parcel, 4, this.d);
        d0.k(parcel, 5, this.f10411e, i10);
        d0.r(parcel, q6);
    }
}
