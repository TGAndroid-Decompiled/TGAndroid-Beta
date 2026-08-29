package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class m extends a6.a {
    public static final Parcelable.Creator<m> CREATOR = new w0(0);
    public final c f19405a;
    public final Boolean f19406b;
    public final j0 f19407c;
    public final e0 d;

    public m(String str, Boolean bool, String str2, String str3) {
        c a2;
        j0 a10;
        e0 e0Var = null;
        if (str == null) {
            a2 = null;
        } else {
            try {
                a2 = c.a(str);
            } catch (b | d0 | t0 e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f19405a = a2;
        this.f19406b = bool;
        if (str2 == null) {
            a10 = null;
        } else {
            a10 = j0.a(str2);
        }
        this.f19407c = a10;
        if (str3 != null) {
            e0Var = e0.a(str3);
        }
        this.d = e0Var;
    }

    public final e0 b() {
        e0 e0Var = this.d;
        if (e0Var == null) {
            Boolean bool = this.f19406b;
            if (bool == null || !bool.booleanValue()) {
                return null;
            }
            return e0.RESIDENT_KEY_REQUIRED;
        }
        return e0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!z5.l.l(this.f19405a, mVar.f19405a) || !z5.l.l(this.f19406b, mVar.f19406b) || !z5.l.l(this.f19407c, mVar.f19407c) || !z5.l.l(b(), mVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19405a, this.f19406b, this.f19407c, b()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19405a);
        String valueOf2 = String.valueOf(this.f19407c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder s10 = a4.w.s("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        s10.append(this.f19406b);
        s10.append(", \n requireUserVerification=");
        s10.append(valueOf2);
        s10.append(", \n residentKeyRequirement=");
        return a4.w.q(s10, valueOf3, "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        String str2;
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        String str3 = null;
        c cVar = this.f19405a;
        if (cVar == null) {
            str = null;
        } else {
            str = cVar.f19360a;
        }
        com.google.android.gms.internal.cast.o.l(parcel, 2, str);
        com.google.android.gms.internal.cast.o.a(parcel, 3, this.f19406b);
        j0 j0Var = this.f19407c;
        if (j0Var == null) {
            str2 = null;
        } else {
            str2 = j0Var.f19397a;
        }
        com.google.android.gms.internal.cast.o.l(parcel, 4, str2);
        e0 b10 = b();
        if (b10 != null) {
            str3 = b10.f19369a;
        }
        com.google.android.gms.internal.cast.o.l(parcel, 5, str3);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
