package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new r0(18);
    public final c f4449a;
    public final Boolean f4450b;
    public final j0 f4451c;
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
            } catch (b | d0 | t0 e7) {
                throw new IllegalArgumentException(e7);
            }
        }
        this.f4449a = a2;
        this.f4450b = bool;
        if (str2 == null) {
            a10 = null;
        } else {
            a10 = j0.a(str2);
        }
        this.f4451c = a10;
        if (str3 != null) {
            e0Var = e0.a(str3);
        }
        this.d = e0Var;
    }

    public final e0 b() {
        e0 e0Var = this.d;
        if (e0Var == null) {
            Boolean bool = this.f4450b;
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
        if (!n6.l.l(this.f4449a, mVar.f4449a) || !n6.l.l(this.f4450b, mVar.f4450b) || !n6.l.l(this.f4451c, mVar.f4451c) || !n6.l.l(b(), mVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4449a, this.f4450b, this.f4451c, b()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4449a);
        String valueOf2 = String.valueOf(this.f4451c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder w10 = a4.a.w("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        w10.append(this.f4450b);
        w10.append(", \n requireUserVerification=");
        w10.append(valueOf2);
        w10.append(", \n residentKeyRequirement=");
        return a4.a.t(w10, valueOf3, "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        String str2;
        int q6 = w7.g0.q(parcel, 20293);
        String str3 = null;
        c cVar = this.f4449a;
        if (cVar == null) {
            str = null;
        } else {
            str = cVar.f4404a;
        }
        w7.g0.l(parcel, 2, str);
        w7.g0.a(parcel, 3, this.f4450b);
        j0 j0Var = this.f4451c;
        if (j0Var == null) {
            str2 = null;
        } else {
            str2 = j0Var.f4441a;
        }
        w7.g0.l(parcel, 4, str2);
        e0 b10 = b();
        if (b10 != null) {
            str3 = b10.f4413a;
        }
        w7.g0.l(parcel, 5, str3);
        w7.g0.r(parcel, q6);
    }
}
