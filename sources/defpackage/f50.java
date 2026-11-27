package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class f50 extends c4 {
    public static final Parcelable.Creator<f50> CREATOR = new t4f((byte) 2);
    public final cy a;
    public final Boolean b;
    public final ubc c;
    public final pd9 d;

    public f50(String str, Boolean bool, String str2, String str3) {
        cy a;
        ubc a2;
        if (str == null) {
            a = null;
        } else {
            try {
                a = cy.a(str);
            } catch (ay | od9 | xgd e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.a = a;
        this.b = bool;
        if (str2 == null) {
            a2 = null;
        } else {
            a2 = ubc.a(str2);
        }
        this.c = a2;
        this.d = str3 != null ? pd9.a(str3) : null;
    }

    public final pd9 b() {
        pd9 pd9Var = this.d;
        if (pd9Var == null) {
            pd9Var = null;
            Boolean bool = this.b;
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return null;
                }
                return pd9.RESIDENT_KEY_REQUIRED;
            }
        }
        return pd9Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f50)) {
            return false;
        }
        f50 f50Var = (f50) obj;
        if (!vue.a(this.a, f50Var.a) || !vue.a(this.b, f50Var.b) || !vue.a(this.c, f50Var.c) || !vue.a(b(), f50Var.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, b()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder p = ik8.p("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        p.append(this.b);
        p.append(", \n requireUserVerification=");
        p.append(valueOf2);
        p.append(", \n residentKeyRequirement=");
        return c00.k(p, valueOf3, "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        int r = bye.r(parcel, 20293);
        String str3 = null;
        cy cyVar = this.a;
        if (cyVar == null) {
            str = null;
        } else {
            str = cyVar.a;
        }
        bye.l(parcel, 2, str);
        bye.a(parcel, 3, this.b);
        ubc ubcVar = this.c;
        if (ubcVar == null) {
            str2 = null;
        } else {
            str2 = ubcVar.a;
        }
        bye.l(parcel, 4, str2);
        pd9 b = b();
        if (b != null) {
            str3 = b.a;
        }
        bye.l(parcel, 5, str3);
        bye.s(parcel, r);
    }
}
