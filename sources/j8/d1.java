package j8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.n8;
import h7.r8;
import java.util.Arrays;

public final class d1 extends z5.a {
    public static final Parcelable.Creator<d1> CREATOR = new o0(10);

    public final String f12769a;

    public final String f12770b;

    public final b1 f12771c;
    public final String d;

    public final String f12772e;

    public final Float f12773f;
    public final f1 h;

    public d1(String str, String str2, b1 b1Var, String str3, String str4, Float f10, f1 f1Var) {
        this.f12769a = str;
        this.f12770b = str2;
        this.f12771c = b1Var;
        this.d = str3;
        this.f12772e = str4;
        this.f12773f = f10;
        this.h = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (n8.a(this.f12769a, d1Var.f12769a) && n8.a(this.f12770b, d1Var.f12770b) && n8.a(this.f12771c, d1Var.f12771c) && n8.a(this.d, d1Var.d) && n8.a(this.f12772e, d1Var.f12772e) && n8.a(this.f12773f, d1Var.f12773f) && n8.a(this.h, d1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12769a, this.f12770b, this.f12771c, this.d, this.f12772e, this.f12773f, this.h});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.h);
        String strValueOf2 = String.valueOf(this.f12771c);
        StringBuilder sbP = i0.a.p("AppParcelable{title='", this.f12770b, "', developerName='", this.d, "', formattedPrice='");
        sbP.append(this.f12772e);
        sbP.append("', starRating=");
        sbP.append(this.f12773f);
        sbP.append(", wearDetails=");
        i0.a.z(sbP, strValueOf, ", deepLinkUri='", this.f12769a, "', icon=");
        return a9.p.p(sbP, strValueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.f12769a);
        r8.l(parcel, 2, this.f12770b);
        r8.k(parcel, 3, this.f12771c, i10);
        r8.l(parcel, 4, this.d);
        r8.l(parcel, 5, this.f12772e);
        r8.e(parcel, 6, this.f12773f);
        r8.k(parcel, 7, this.h, i10);
        r8.r(parcel, iQ);
    }
}
