package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(3);
    public final long f9492a;
    public final int f9493b;
    public final boolean f9494c;
    public final String d;
    public final r7.j e;

    public b(long j3, int i10, boolean z10, String str, r7.j jVar) {
        this.f9492a = j3;
        this.f9493b = i10;
        this.f9494c = z10;
        this.d = str;
        this.e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f9492a != bVar.f9492a || this.f9493b != bVar.f9493b || this.f9494c != bVar.f9494c || !n6.l.l(this.d, bVar.d) || !n6.l.l(this.e, bVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9492a), Integer.valueOf(this.f9493b), Boolean.valueOf(this.f9494c)});
    }

    public final String toString() {
        String str;
        StringBuilder v = a4.a.v("LastLocationRequest[");
        long j3 = this.f9492a;
        if (j3 != Long.MAX_VALUE) {
            v.append("maxAge=");
            r7.p.a(v, j3);
        }
        int i10 = this.f9493b;
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
        if (this.f9494c) {
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
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 8);
        parcel.writeLong(this.f9492a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f9493b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f9494c ? 1 : 0);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.e, i10);
        e0.r(parcel, q6);
    }
}
