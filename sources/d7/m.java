package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class m extends p6.a {
    public static final Parcelable.Creator<m> CREATOR = new r0(19);
    public final c f8204a;
    public final Boolean f8205b;
    public final j0 f8206c;
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
        this.f8204a = a2;
        this.f8205b = bool;
        if (str2 == null) {
            a10 = null;
        } else {
            a10 = j0.a(str2);
        }
        this.f8206c = a10;
        if (str3 != null) {
            e0Var = e0.a(str3);
        }
        this.d = e0Var;
    }

    public final e0 b() {
        e0 e0Var = this.d;
        if (e0Var == null) {
            Boolean bool = this.f8205b;
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
        if (!o6.l.l(this.f8204a, mVar.f8204a) || !o6.l.l(this.f8205b, mVar.f8205b) || !o6.l.l(this.f8206c, mVar.f8206c) || !o6.l.l(b(), mVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8204a, this.f8205b, this.f8206c, b()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8204a);
        String valueOf2 = String.valueOf(this.f8206c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder v = a1.g.v("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        v.append(this.f8205b);
        v.append(", \n requireUserVerification=");
        v.append(valueOf2);
        v.append(", \n residentKeyRequirement=");
        return a1.g.s(v, valueOf3, "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        String str2;
        int q5 = df.q(parcel, 20293);
        String str3 = null;
        c cVar = this.f8204a;
        if (cVar == null) {
            str = null;
        } else {
            str = cVar.f8162a;
        }
        df.l(parcel, 2, str);
        df.a(parcel, 3, this.f8205b);
        j0 j0Var = this.f8206c;
        if (j0Var == null) {
            str2 = null;
        } else {
            str2 = j0Var.f8196a;
        }
        df.l(parcel, 4, str2);
        e0 b10 = b();
        if (b10 != null) {
            str3 = b10.f8171a;
        }
        df.l(parcel, 5, str3);
        df.r(parcel, q5);
    }
}
