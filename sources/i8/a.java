package i8;

import android.os.Parcel;
import android.os.Parcelable;
import i7.p;
import java.util.Arrays;
import p6.m;
import t7.n;
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new p(6);
    public final long f14692a;
    public final int f14693b;
    public final boolean f14694c;
    public final String d;
    public final t7.j f14695e;

    public a(long j10, int i3, boolean z10, String str, t7.j jVar) {
        this.f14692a = j10;
        this.f14693b = i3;
        this.f14694c = z10;
        this.d = str;
        this.f14695e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f14692a != aVar.f14692a || this.f14693b != aVar.f14693b || this.f14694c != aVar.f14694c || !m.k(this.d, aVar.d) || !m.k(this.f14695e, aVar.f14695e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f14692a), Integer.valueOf(this.f14693b), Boolean.valueOf(this.f14694c)});
    }

    public final String toString() {
        String str;
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l("LastLocationRequest[");
        long j10 = this.f14692a;
        if (j10 != Long.MAX_VALUE) {
            l10.append("maxAge=");
            n.a(j10, l10);
        }
        int i3 = this.f14693b;
        if (i3 != 0) {
            l10.append(", ");
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
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
            l10.append(str);
        }
        if (this.f14694c) {
            l10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            l10.append(", moduleId=");
            l10.append(str2);
        }
        t7.j jVar = this.f14695e;
        if (jVar != null) {
            l10.append(", impersonation=");
            l10.append(jVar);
        }
        l10.append(']');
        return l10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 8);
        parcel.writeLong(this.f14692a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f14693b);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f14694c ? 1 : 0);
        j8.a.m(parcel, 4, this.d);
        j8.a.l(parcel, 5, this.f14695e, i3);
        j8.a.t(parcel, s6);
    }
}
