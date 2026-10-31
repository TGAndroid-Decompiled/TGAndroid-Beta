package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import r7.n;
import w7.h0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new g(2);
    public final long f7446a;
    public final int f7447b;
    public final boolean f7448c;
    public final String d;
    public final r7.j e;

    public a(long j10, int i10, boolean z10, String str, r7.j jVar) {
        this.f7446a = j10;
        this.f7447b = i10;
        this.f7448c = z10;
        this.d = str;
        this.e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f7446a != aVar.f7446a || this.f7447b != aVar.f7447b || this.f7448c != aVar.f7448c || !l.k(this.d, aVar.d) || !l.k(this.e, aVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7446a), Integer.valueOf(this.f7447b), Boolean.valueOf(this.f7448c)});
    }

    public final String toString() {
        String str;
        StringBuilder t10 = a1.g.t("LastLocationRequest[");
        long j10 = this.f7446a;
        if (j10 != Long.MAX_VALUE) {
            t10.append("maxAge=");
            n.a(j10, t10);
        }
        int i10 = this.f7447b;
        if (i10 != 0) {
            t10.append(", ");
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
            t10.append(str);
        }
        if (this.f7448c) {
            t10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            t10.append(", moduleId=");
            t10.append(str2);
        }
        r7.j jVar = this.e;
        if (jVar != null) {
            t10.append(", impersonation=");
            t10.append(jVar);
        }
        t10.append(']');
        return t10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 8);
        parcel.writeLong(this.f7446a);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f7447b);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.f7448c ? 1 : 0);
        h0.l(parcel, 4, this.d);
        h0.k(parcel, 5, this.e, i10);
        h0.r(parcel, q6);
    }
}
