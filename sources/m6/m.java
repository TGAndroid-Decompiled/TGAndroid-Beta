package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class m extends y5.a {
    public static final Parcelable.Creator<m> CREATOR = new r0(18);
    public final c f17545a;
    public final Boolean f17546b;
    public final j0 f17547c;
    public final e0 d;

    public m(String str, Boolean bool, String str2, String str3) {
        c a2;
        j0 a3;
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
        this.f17545a = a2;
        this.f17546b = bool;
        if (str2 == null) {
            a3 = null;
        } else {
            a3 = j0.a(str2);
        }
        this.f17547c = a3;
        if (str3 != null) {
            e0Var = e0.a(str3);
        }
        this.d = e0Var;
    }

    public final e0 b() {
        e0 e0Var = this.d;
        if (e0Var == null) {
            Boolean bool = this.f17546b;
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
        if (!x5.l.l(this.f17545a, mVar.f17545a) || !x5.l.l(this.f17546b, mVar.f17546b) || !x5.l.l(this.f17547c, mVar.f17547c) || !x5.l.l(b(), mVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17545a, this.f17546b, this.f17547c, b()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f17545a);
        String valueOf2 = String.valueOf(this.f17547c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder t10 = aa.d.t("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        t10.append(this.f17546b);
        t10.append(", \n requireUserVerification=");
        t10.append(valueOf2);
        t10.append(", \n residentKeyRequirement=");
        return aa.d.r(t10, valueOf3, "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        String str;
        String str2;
        int q10 = p8.q(parcel, 20293);
        String str3 = null;
        c cVar = this.f17545a;
        if (cVar == null) {
            str = null;
        } else {
            str = cVar.f17500a;
        }
        p8.l(parcel, 2, str);
        p8.a(parcel, 3, this.f17546b);
        j0 j0Var = this.f17547c;
        if (j0Var == null) {
            str2 = null;
        } else {
            str2 = j0Var.f17537a;
        }
        p8.l(parcel, 4, str2);
        e0 b10 = b();
        if (b10 != null) {
            str3 = b10.f17509a;
        }
        p8.l(parcel, 5, str3);
        p8.r(parcel, q10);
    }
}
