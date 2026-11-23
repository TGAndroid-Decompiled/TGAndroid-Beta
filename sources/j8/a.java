package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
import q6.m;
import u7.n;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new j7.b(21);
    public final long f17309a;
    public final int f17310b;
    public final boolean f17311c;
    public final String d;
    public final u7.j f17312e;

    public a(long j3, int i7, boolean z10, String str, u7.j jVar) {
        this.f17309a = j3;
        this.f17310b = i7;
        this.f17311c = z10;
        this.d = str;
        this.f17312e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f17309a != aVar.f17309a || this.f17310b != aVar.f17310b || this.f17311c != aVar.f17311c || !m.l(this.d, aVar.d) || !m.l(this.f17312e, aVar.f17312e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f17309a), Integer.valueOf(this.f17310b), Boolean.valueOf(this.f17311c)});
    }

    public final String toString() {
        String str;
        StringBuilder m10 = e2.m("LastLocationRequest[");
        long j3 = this.f17309a;
        if (j3 != Long.MAX_VALUE) {
            m10.append("maxAge=");
            n.a(j3, m10);
        }
        int i7 = this.f17310b;
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
        if (this.f17311c) {
            m10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            m10.append(", moduleId=");
            m10.append(str2);
        }
        u7.j jVar = this.f17312e;
        if (jVar != null) {
            m10.append(", impersonation=");
            m10.append(jVar);
        }
        m10.append(']');
        return m10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 8);
        parcel.writeLong(this.f17309a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f17310b);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f17311c ? 1 : 0);
        cc.l(parcel, 4, this.d);
        cc.k(parcel, 5, this.f17312e, i7);
        cc.s(parcel, r10);
    }
}
