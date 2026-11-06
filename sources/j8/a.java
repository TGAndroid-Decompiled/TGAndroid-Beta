package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
import q6.m;
import u7.n;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new j7.b(21);
    public final long f16577a;
    public final int f16578b;
    public final boolean f16579c;
    public final String d;
    public final u7.j f16580e;

    public a(long j3, int i7, boolean z9, String str, u7.j jVar) {
        this.f16577a = j3;
        this.f16578b = i7;
        this.f16579c = z9;
        this.d = str;
        this.f16580e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f16577a != aVar.f16577a || this.f16578b != aVar.f16578b || this.f16579c != aVar.f16579c || !m.k(this.d, aVar.d) || !m.k(this.f16580e, aVar.f16580e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f16577a), Integer.valueOf(this.f16578b), Boolean.valueOf(this.f16579c)});
    }

    public final String toString() {
        String str;
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("LastLocationRequest[");
        long j3 = this.f16577a;
        if (j3 != Long.MAX_VALUE) {
            m10.append("maxAge=");
            n.a(j3, m10);
        }
        int i7 = this.f16578b;
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
        if (this.f16579c) {
            m10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            m10.append(", moduleId=");
            m10.append(str2);
        }
        u7.j jVar = this.f16580e;
        if (jVar != null) {
            m10.append(", impersonation=");
            m10.append(jVar);
        }
        m10.append(']');
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 8);
        parcel.writeLong(this.f16577a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.f16578b);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.f16579c ? 1 : 0);
        wb.l(parcel, 4, this.d);
        wb.k(parcel, 5, this.f16580e, i7);
        wb.s(parcel, r10);
    }
}
