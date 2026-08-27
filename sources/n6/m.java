package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class m extends z5.a {
    public static final Parcelable.Creator<m> CREATOR = new o0(29);

    public final c f18381a;

    public final Boolean f18382b;

    public final j0 f18383c;
    public final e0 d;

    public m(String str, Boolean bool, String str2, String str3) {
        c cVarA;
        e0 e0VarA = null;
        if (str == null) {
            cVarA = null;
        } else {
            try {
                cVarA = c.a(str);
            } catch (b | d0 | t0 e9) {
                throw new IllegalArgumentException(e9);
            }
        }
        this.f18381a = cVarA;
        this.f18382b = bool;
        this.f18383c = str2 == null ? null : j0.a(str2);
        if (str3 != null) {
            e0VarA = e0.a(str3);
        }
        this.d = e0VarA;
    }

    public final e0 b() {
        e0 e0Var = this.d;
        if (e0Var != null) {
            return e0Var;
        }
        Boolean bool = this.f18382b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return e0.RESIDENT_KEY_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return y5.l.l(this.f18381a, mVar.f18381a) && y5.l.l(this.f18382b, mVar.f18382b) && y5.l.l(this.f18383c, mVar.f18383c) && y5.l.l(b(), mVar.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18381a, this.f18382b, this.f18383c, b()});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18381a);
        String strValueOf2 = String.valueOf(this.f18383c);
        String strValueOf3 = String.valueOf(this.d);
        StringBuilder sbR = a9.p.r("AuthenticatorSelectionCriteria{\n attachment=", strValueOf, ", \n requireResidentKey=");
        sbR.append(this.f18382b);
        sbR.append(", \n requireUserVerification=");
        sbR.append(strValueOf2);
        sbR.append(", \n residentKeyRequirement=");
        return a9.p.p(sbR, strValueOf3, "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        c cVar = this.f18381a;
        r8.l(parcel, 2, cVar == null ? null : cVar.f18336a);
        r8.a(parcel, 3, this.f18382b);
        j0 j0Var = this.f18383c;
        r8.l(parcel, 4, j0Var == null ? null : j0Var.f18373a);
        e0 e0VarB = b();
        r8.l(parcel, 5, e0VarB != null ? e0VarB.f18345a : null);
        r8.r(parcel, iQ);
    }
}
