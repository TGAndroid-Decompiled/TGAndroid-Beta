package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(3);
    public final long f9491a;
    public final int f9492b;
    public final boolean f9493c;
    public final String d;
    public final r7.j e;

    public b(long j3, int i10, boolean z10, String str, r7.j jVar) {
        this.f9491a = j3;
        this.f9492b = i10;
        this.f9493c = z10;
        this.d = str;
        this.e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f9491a != bVar.f9491a || this.f9492b != bVar.f9492b || this.f9493c != bVar.f9493c || !n6.l.l(this.d, bVar.d) || !n6.l.l(this.e, bVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9491a), Integer.valueOf(this.f9492b), Boolean.valueOf(this.f9493c)});
    }

    public final String toString() {
        String str;
        StringBuilder v = a4.a.v("LastLocationRequest[");
        long j3 = this.f9491a;
        if (j3 != Long.MAX_VALUE) {
            v.append("maxAge=");
            r7.p.a(v, j3);
        }
        int i10 = this.f9492b;
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
        if (this.f9493c) {
            v.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            v.append(", moduleId=");
            v.append(str2);
        }
        r7.j jVar = this.e;
        if (jVar != null) {
            v.append(", impersonation=");
            v.append(jVar);
        }
        v.append(']');
        return v.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 8);
        parcel.writeLong(this.f9491a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.f9492b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.f9493c ? 1 : 0);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.r(parcel, q6);
    }
}
