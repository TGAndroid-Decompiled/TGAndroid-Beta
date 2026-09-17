package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(3);
    public final long f10499a;
    public final int f10500b;
    public final boolean f10501c;
    public final String d;
    public final r7.j f10502e;

    public b(long j3, int i10, boolean z10, String str, r7.j jVar) {
        this.f10499a = j3;
        this.f10500b = i10;
        this.f10501c = z10;
        this.d = str;
        this.f10502e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f10499a != bVar.f10499a || this.f10500b != bVar.f10500b || this.f10501c != bVar.f10501c || !n6.l.l(this.d, bVar.d) || !n6.l.l(this.f10502e, bVar.f10502e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10499a), Integer.valueOf(this.f10500b), Boolean.valueOf(this.f10501c)});
    }

    public final String toString() {
        String str;
        StringBuilder u10 = a4.a.u("LastLocationRequest[");
        long j3 = this.f10499a;
        if (j3 != Long.MAX_VALUE) {
            u10.append("maxAge=");
            r7.p.a(u10, j3);
        }
        int i10 = this.f10500b;
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
        if (this.f10501c) {
            u10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            u10.append(", moduleId=");
            u10.append(str2);
        }
        r7.j jVar = this.f10502e;
        if (jVar != null) {
            u10.append(", impersonation=");
            u10.append(jVar);
        }
        u10.append(']');
        return u10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 8);
        parcel.writeLong(this.f10499a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f10500b);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.f10501c ? 1 : 0);
        e0.l(parcel, 4, this.d);
        e0.k(parcel, 5, this.f10502e, i10);
        e0.r(parcel, q6);
    }
}
