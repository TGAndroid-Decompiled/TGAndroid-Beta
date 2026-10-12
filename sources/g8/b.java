package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.c0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(3);
    public final long f10406a;
    public final int f10407b;
    public final boolean f10408c;
    public final String d;
    public final r7.j f10409e;

    public b(long j3, int i10, boolean z10, String str, r7.j jVar) {
        this.f10406a = j3;
        this.f10407b = i10;
        this.f10408c = z10;
        this.d = str;
        this.f10409e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f10406a != bVar.f10406a || this.f10407b != bVar.f10407b || this.f10408c != bVar.f10408c || !n6.m.l(this.d, bVar.d) || !n6.m.l(this.f10409e, bVar.f10409e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10406a), Integer.valueOf(this.f10407b), Boolean.valueOf(this.f10408c)});
    }

    public final String toString() {
        String str;
        StringBuilder v = a1.g.v("LastLocationRequest[");
        long j3 = this.f10406a;
        if (j3 != Long.MAX_VALUE) {
            v.append("maxAge=");
            r7.p.a(v, j3);
        }
        int i10 = this.f10407b;
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
        if (this.f10408c) {
            v.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            v.append(", moduleId=");
            v.append(str2);
        }
        r7.j jVar = this.f10409e;
        if (jVar != null) {
            v.append(", impersonation=");
            v.append(jVar);
        }
        v.append(']');
        return v.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.s(parcel, 1, 8);
        parcel.writeLong(this.f10406a);
        c0.s(parcel, 2, 4);
        parcel.writeInt(this.f10407b);
        c0.s(parcel, 3, 4);
        parcel.writeInt(this.f10408c ? 1 : 0);
        c0.l(parcel, 4, this.d);
        c0.k(parcel, 5, this.f10409e, i10);
        c0.r(parcel, q6);
    }
}
