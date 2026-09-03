package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import org.telegram.ui.ai;
public final class d1 extends c6.a {
    public static final Parcelable.Creator<d1> CREATOR = new o0(10);
    public final String f13779a;
    public final String f13780b;
    public final b1 f13781c;
    public final String d;
    public final String e;
    public final Float f13782f;
    public final f1 h;

    public d1(String str, String str2, b1 b1Var, String str3, String str4, Float f10, f1 f1Var) {
        this.f13779a = str;
        this.f13780b = str2;
        this.f13781c = b1Var;
        this.d = str3;
        this.e = str4;
        this.f13782f = f10;
        this.h = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (k7.p.a(this.f13779a, d1Var.f13779a) && k7.p.a(this.f13780b, d1Var.f13780b) && k7.p.a(this.f13781c, d1Var.f13781c) && k7.p.a(this.d, d1Var.d) && k7.p.a(this.e, d1Var.e) && k7.p.a(this.f13782f, d1Var.f13782f) && k7.p.a(this.h, d1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13779a, this.f13780b, this.f13781c, this.d, this.e, this.f13782f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f13781c);
        StringBuilder l10 = ai.l("AppParcelable{title='", this.f13780b, "', developerName='", this.d, "', formattedPrice='");
        l10.append(this.e);
        l10.append("', starRating=");
        l10.append(this.f13782f);
        l10.append(", wearDetails=");
        ai.w(l10, valueOf, ", deepLinkUri='", this.f13779a, "', icon=");
        return android.support.v4.media.a.r(l10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f13779a);
        f5.l(parcel, 2, this.f13780b);
        f5.k(parcel, 3, this.f13781c, i10);
        f5.l(parcel, 4, this.d);
        f5.l(parcel, 5, this.e);
        f5.e(parcel, 6, this.f13782f);
        f5.k(parcel, 7, this.h, i10);
        f5.r(parcel, q10);
    }
}
