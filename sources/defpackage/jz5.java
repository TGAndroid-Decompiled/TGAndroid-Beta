package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class jz5 extends b4 {
    public static final Parcelable.Creator<jz5> CREATOR = new yhf((byte) 2);
    public final long a;
    public final int b;
    public final boolean c;
    public final String d;
    public final epd e;

    public jz5(long j, int i, boolean z, String str, epd epdVar) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = str;
        this.e = epdVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jz5)) {
            return false;
        }
        jz5 jz5Var = (jz5) obj;
        if (this.a != jz5Var.a || this.b != jz5Var.b || this.c != jz5Var.c || !fse.a(this.d, jz5Var.d) || !fse.a(this.e, jz5Var.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder s = td4.s("LastLocationRequest[");
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            s.append("maxAge=");
            vrd.a(j, s);
        }
        int i = this.b;
        if (i != 0) {
            s.append(", ");
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        str = "GRANULARITY_FINE";
                    } else {
                        i98.g();
                        return null;
                    }
                } else {
                    str = "GRANULARITY_COARSE";
                }
            } else {
                str = "GRANULARITY_PERMISSION_LEVEL";
            }
            s.append(str);
        }
        if (this.c) {
            s.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            s.append(", moduleId=");
            s.append(str2);
        }
        epd epdVar = this.e;
        if (epdVar != null) {
            s.append(", impersonation=");
            s.append(epdVar);
        }
        s.append(']');
        return s.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 8);
        parcel.writeLong(this.a);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        mve.l(parcel, 4, this.d);
        mve.k(parcel, 5, this.e, i);
        mve.s(parcel, r);
    }
}
