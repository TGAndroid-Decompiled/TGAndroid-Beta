package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new r0(18);
    public final c f4009a;
    public final Boolean f4010b;
    public final j0 f4011c;
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
            } catch (b | d0 | t0 e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.f4009a = a2;
        this.f4010b = bool;
        if (str2 == null) {
            a10 = null;
        } else {
            a10 = j0.a(str2);
        }
        this.f4011c = a10;
        if (str3 != null) {
            e0Var = e0.a(str3);
        }
        this.d = e0Var;
    }

    public final e0 b() {
        e0 e0Var = this.d;
        if (e0Var == null) {
            Boolean bool = this.f4010b;
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
        if (!n6.l.k(this.f4009a, mVar.f4009a) || !n6.l.k(this.f4010b, mVar.f4010b) || !n6.l.k(this.f4011c, mVar.f4011c) || !n6.l.k(b(), mVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4009a, this.f4010b, this.f4011c, b()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4009a);
        String valueOf2 = String.valueOf(this.f4011c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder u10 = a1.g.u("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        u10.append(this.f4010b);
        u10.append(", \n requireUserVerification=");
        u10.append(valueOf2);
        u10.append(", \n residentKeyRequirement=");
        return a1.g.r(u10, valueOf3, "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        String str2;
        int q6 = w7.h0.q(parcel, 20293);
        String str3 = null;
        c cVar = this.f4009a;
        if (cVar == null) {
            str = null;
        } else {
            str = cVar.f3966a;
        }
        w7.h0.l(parcel, 2, str);
        w7.h0.a(parcel, 3, this.f4010b);
        j0 j0Var = this.f4011c;
        if (j0Var == null) {
            str2 = null;
        } else {
            str2 = j0Var.f4001a;
        }
        w7.h0.l(parcel, 4, str2);
        e0 b10 = b();
        if (b10 != null) {
            str3 = b10.f3975a;
        }
        w7.h0.l(parcel, 5, str3);
        w7.h0.r(parcel, q6);
    }
}
