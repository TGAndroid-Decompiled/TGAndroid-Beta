package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
import q6.m;
import u7.n;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new j7.b(21);
    public final long f17343a;
    public final int f17344b;
    public final boolean f17345c;
    public final String d;
    public final u7.j f17346e;

    public a(long j3, int i7, boolean z10, String str, u7.j jVar) {
        this.f17343a = j3;
        this.f17344b = i7;
        this.f17345c = z10;
        this.d = str;
        this.f17346e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f17343a != aVar.f17343a || this.f17344b != aVar.f17344b || this.f17345c != aVar.f17345c || !m.l(this.d, aVar.d) || !m.l(this.f17346e, aVar.f17346e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f17343a), Integer.valueOf(this.f17344b), Boolean.valueOf(this.f17345c)});
    }

    public final String toString() {
        String str;
        StringBuilder m10 = e2.m("LastLocationRequest[");
        long j3 = this.f17343a;
        if (j3 != Long.MAX_VALUE) {
            m10.append("maxAge=");
            n.a(j3, m10);
        }
        int i7 = this.f17344b;
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
        if (this.f17345c) {
            m10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            m10.append(", moduleId=");
            m10.append(str2);
        }
        u7.j jVar = this.f17346e;
        if (jVar != null) {
            m10.append(", impersonation=");
            m10.append(jVar);
        }
        m10.append(']');
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 8);
        parcel.writeLong(this.f17343a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f17344b);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f17345c ? 1 : 0);
        bc.l(parcel, 4, this.d);
        bc.k(parcel, 5, this.f17346e, i7);
        bc.s(parcel, r10);
    }
}
