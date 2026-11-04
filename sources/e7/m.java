package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class m extends q6.a {
    public static final Parcelable.Creator<m> CREATOR = new r0(22);
    public final c f9846a;
    public final Boolean f9847b;
    public final j0 f9848c;
    public final e0 d;

    public m(String str, Boolean bool, String str2, String str3) {
        c a10;
        j0 a11;
        e0 e0Var = null;
        if (str == null) {
            a10 = null;
        } else {
            try {
                a10 = c.a(str);
            } catch (b | d0 | t0 e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f9846a = a10;
        this.f9847b = bool;
        if (str2 == null) {
            a11 = null;
        } else {
            a11 = j0.a(str2);
        }
        this.f9848c = a11;
        if (str3 != null) {
            e0Var = e0.a(str3);
        }
        this.d = e0Var;
    }

    public final e0 b() {
        e0 e0Var = this.d;
        if (e0Var == null) {
            Boolean bool = this.f9847b;
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
        if (!p6.m.k(this.f9846a, mVar.f9846a) || !p6.m.k(this.f9847b, mVar.f9847b) || !p6.m.k(this.f9848c, mVar.f9848c) || !p6.m.k(b(), mVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9846a, this.f9847b, this.f9848c, b()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9846a);
        String valueOf2 = String.valueOf(this.f9848c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder u10 = a1.g.u("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        u10.append(this.f9847b);
        u10.append(", \n requireUserVerification=");
        u10.append(valueOf2);
        u10.append(", \n residentKeyRequirement=");
        return a1.g.s(u10, valueOf3, "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        String str;
        String str2;
        int s6 = j8.a.s(parcel, 20293);
        String str3 = null;
        c cVar = this.f9846a;
        if (cVar == null) {
            str = null;
        } else {
            str = cVar.f9800a;
        }
        j8.a.m(parcel, 2, str);
        j8.a.b(parcel, 3, this.f9847b);
        j0 j0Var = this.f9848c;
        if (j0Var == null) {
            str2 = null;
        } else {
            str2 = j0Var.f9838a;
        }
        j8.a.m(parcel, 4, str2);
        e0 b10 = b();
        if (b10 != null) {
            str3 = b10.f9809a;
        }
        j8.a.m(parcel, 5, str3);
        j8.a.t(parcel, s6);
    }
}
