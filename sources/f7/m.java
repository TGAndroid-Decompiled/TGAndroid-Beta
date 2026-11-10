package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new t0(7);
    public final c f11408a;
    public final Boolean f11409b;
    public final j0 f11410c;
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
            } catch (b | d0 | s0 e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f11408a = a10;
        this.f11409b = bool;
        if (str2 == null) {
            a11 = null;
        } else {
            a11 = j0.a(str2);
        }
        this.f11410c = a11;
        if (str3 != null) {
            e0Var = e0.a(str3);
        }
        this.d = e0Var;
    }

    public final e0 b() {
        e0 e0Var = this.d;
        if (e0Var == null) {
            Boolean bool = this.f11409b;
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
        if (!q6.m.k(this.f11408a, mVar.f11408a) || !q6.m.k(this.f11409b, mVar.f11409b) || !q6.m.k(this.f11410c, mVar.f11410c) || !q6.m.k(b(), mVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11408a, this.f11409b, this.f11410c, b()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11408a);
        String valueOf2 = String.valueOf(this.f11410c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder u10 = a8.p0.u("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        u10.append(this.f11409b);
        u10.append(", \n requireUserVerification=");
        u10.append(valueOf2);
        u10.append(", \n residentKeyRequirement=");
        return a8.p0.s(u10, valueOf3, "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str;
        String str2;
        int r10 = xb.r(parcel, 20293);
        String str3 = null;
        c cVar = this.f11408a;
        if (cVar == null) {
            str = null;
        } else {
            str = cVar.f11362a;
        }
        xb.l(parcel, 2, str);
        xb.a(parcel, 3, this.f11409b);
        j0 j0Var = this.f11410c;
        if (j0Var == null) {
            str2 = null;
        } else {
            str2 = j0Var.f11400a;
        }
        xb.l(parcel, 4, str2);
        e0 b10 = b();
        if (b10 != null) {
            str3 = b10.f11371a;
        }
        xb.l(parcel, 5, str3);
        xb.s(parcel, r10);
    }
}
