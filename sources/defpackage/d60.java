package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class d60 extends b4 {
    public static final Parcelable.Creator<d60> CREATOR = new e2f((byte) 2);
    public final bz a;
    public final Boolean b;
    public final v9c c;
    public final bc9 d;

    public d60(String str, Boolean bool, String str2, String str3) {
        bz a;
        v9c a2;
        if (str == null) {
            a = null;
        } else {
            try {
                a = bz.a(str);
            } catch (ac9 | az | ged e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.a = a;
        this.b = bool;
        if (str2 == null) {
            a2 = null;
        } else {
            a2 = v9c.a(str2);
        }
        this.c = a2;
        this.d = str3 != null ? bc9.a(str3) : null;
    }

    public final bc9 b() {
        bc9 bc9Var = this.d;
        if (bc9Var == null) {
            bc9Var = null;
            Boolean bool = this.b;
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return null;
                }
                return bc9.RESIDENT_KEY_REQUIRED;
            }
        }
        return bc9Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d60)) {
            return false;
        }
        d60 d60Var = (d60) obj;
        if (!fse.a(this.a, d60Var.a) || !fse.a(this.b, d60Var.b) || !fse.a(this.c, d60Var.c) || !fse.a(b(), d60Var.b())) {
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
        StringBuilder p = wi8.p("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        p.append(this.b);
        p.append(", \n requireUserVerification=");
        p.append(valueOf2);
        p.append(", \n residentKeyRequirement=");
        return b10.j(p, valueOf3, "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        int r = mve.r(parcel, 20293);
        String str3 = null;
        bz bzVar = this.a;
        if (bzVar == null) {
            str = null;
        } else {
            str = bzVar.a;
        }
        mve.l(parcel, 2, str);
        mve.a(parcel, 3, this.b);
        v9c v9cVar = this.c;
        if (v9cVar == null) {
            str2 = null;
        } else {
            str2 = v9cVar.a;
        }
        mve.l(parcel, 4, str2);
        bc9 b = b();
        if (b != null) {
            str3 = b.a;
        }
        mve.l(parcel, 5, str3);
        mve.s(parcel, r);
    }
}
