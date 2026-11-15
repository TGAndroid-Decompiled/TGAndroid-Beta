package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
import q6.m;
import u7.k;
import u7.o;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new j7.b(21);
    public final long f16933a;
    public final int f16934b;
    public final boolean f16935c;
    public final String d;
    public final k f16936e;

    public a(long j3, int i7, boolean z10, String str, k kVar) {
        this.f16933a = j3;
        this.f16934b = i7;
        this.f16935c = z10;
        this.d = str;
        this.f16936e = kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f16933a != aVar.f16933a || this.f16934b != aVar.f16934b || this.f16935c != aVar.f16935c || !m.k(this.d, aVar.d) || !m.k(this.f16936e, aVar.f16936e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f16933a), Integer.valueOf(this.f16934b), Boolean.valueOf(this.f16935c)});
    }

    public final String toString() {
        String str;
        StringBuilder m10 = e2.m("LastLocationRequest[");
        long j3 = this.f16933a;
        if (j3 != Long.MAX_VALUE) {
            m10.append("maxAge=");
            o.a(j3, m10);
        }
        int i7 = this.f16934b;
        if (i7 != 0) {
            m10.append(", ");
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
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
            m10.append(str);
        }
        if (this.f16935c) {
            m10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            m10.append(", moduleId=");
            m10.append(str2);
        }
        k kVar = this.f16936e;
        if (kVar != null) {
            m10.append(", impersonation=");
            m10.append(kVar);
        }
        m10.append(']');
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 8);
        parcel.writeLong(this.f16933a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f16934b);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f16935c ? 1 : 0);
        yb.l(parcel, 4, this.d);
        yb.k(parcel, 5, this.f16936e, i7);
        yb.s(parcel, r10);
    }
}
