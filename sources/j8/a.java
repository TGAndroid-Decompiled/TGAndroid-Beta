package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import q6.m;
import u7.n;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new j7.b(21);
    public final long f16580a;
    public final int f16581b;
    public final boolean f16582c;
    public final String d;
    public final u7.j f16583e;

    public a(long j3, int i7, boolean z9, String str, u7.j jVar) {
        this.f16580a = j3;
        this.f16581b = i7;
        this.f16582c = z9;
        this.d = str;
        this.f16583e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f16580a != aVar.f16580a || this.f16581b != aVar.f16581b || this.f16582c != aVar.f16582c || !m.k(this.d, aVar.d) || !m.k(this.f16583e, aVar.f16583e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f16580a), Integer.valueOf(this.f16581b), Boolean.valueOf(this.f16582c)});
    }

    public final String toString() {
        String str;
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("LastLocationRequest[");
        long j3 = this.f16580a;
        if (j3 != Long.MAX_VALUE) {
            m10.append("maxAge=");
            n.a(j3, m10);
        }
        int i7 = this.f16581b;
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
        if (this.f16582c) {
            m10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            m10.append(", moduleId=");
            m10.append(str2);
        }
        u7.j jVar = this.f16583e;
        if (jVar != null) {
            m10.append(", impersonation=");
            m10.append(jVar);
        }
        m10.append(']');
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 8);
        parcel.writeLong(this.f16580a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f16581b);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f16582c ? 1 : 0);
        xb.l(parcel, 4, this.d);
        xb.k(parcel, 5, this.f16583e, i7);
        xb.s(parcel, r10);
    }
}
