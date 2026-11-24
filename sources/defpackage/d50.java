package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class d50 extends b4 {
    public static final Parcelable.Creator<d50> CREATOR = new c0f((byte) 2);
    public final ay a;
    public final Boolean b;
    public final u7c c;
    public final ba9 d;

    public d50(String str, Boolean bool, String str2, String str3) {
        ay a;
        u7c a2;
        if (str == null) {
            a = null;
        } else {
            try {
                a = ay.a(str);
            } catch (aa9 | ecd | zx e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.a = a;
        this.b = bool;
        if (str2 == null) {
            a2 = null;
        } else {
            a2 = u7c.a(str2);
        }
        this.c = a2;
        this.d = str3 != null ? ba9.a(str3) : null;
    }

    public final ba9 b() {
        ba9 ba9Var = this.d;
        if (ba9Var == null) {
            ba9Var = null;
            Boolean bool = this.b;
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return null;
                }
                return ba9.RESIDENT_KEY_REQUIRED;
            }
        }
        return ba9Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d50)) {
            return false;
        }
        d50 d50Var = (d50) obj;
        if (!cqe.a(this.a, d50Var.a) || !cqe.a(this.b, d50Var.b) || !cqe.a(this.c, d50Var.c) || !cqe.a(b(), d50Var.b())) {
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
        StringBuilder p = ug8.p("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        p.append(this.b);
        p.append(", \n requireUserVerification=");
        p.append(valueOf2);
        p.append(", \n residentKeyRequirement=");
        return b00.j(p, valueOf3, "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        int r = jte.r(parcel, 20293);
        String str3 = null;
        ay ayVar = this.a;
        if (ayVar == null) {
            str = null;
        } else {
            str = ayVar.a;
        }
        jte.l(parcel, 2, str);
        jte.a(parcel, 3, this.b);
        u7c u7cVar = this.c;
        if (u7cVar == null) {
            str2 = null;
        } else {
            str2 = u7cVar.a;
        }
        jte.l(parcel, 4, str2);
        ba9 b = b();
        if (b != null) {
            str3 = b.a;
        }
        jte.l(parcel, 5, str3);
        jte.s(parcel, r);
    }
}
