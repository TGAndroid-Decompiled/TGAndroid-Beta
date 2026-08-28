package i8;

import android.os.Parcel;
import android.os.Parcelable;
import f7.l8;
import g7.p8;
import java.util.Arrays;
public final class e1 extends y5.a {
    public static final Parcelable.Creator<e1> CREATOR = new p0(10);
    public final String f10974a;
    public final String f10975b;
    public final c1 f10976c;
    public final String d;
    public final String f10977e;
    public final Float f10978f;
    public final g1 h;

    public e1(String str, String str2, c1 c1Var, String str3, String str4, Float f10, g1 g1Var) {
        this.f10974a = str;
        this.f10975b = str2;
        this.f10976c = c1Var;
        this.d = str3;
        this.f10977e = str4;
        this.f10978f = f10;
        this.h = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (l8.a(this.f10974a, e1Var.f10974a) && l8.a(this.f10975b, e1Var.f10975b) && l8.a(this.f10976c, e1Var.f10976c) && l8.a(this.d, e1Var.d) && l8.a(this.f10977e, e1Var.f10977e) && l8.a(this.f10978f, e1Var.f10978f) && l8.a(this.h, e1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10974a, this.f10975b, this.f10976c, this.d, this.f10977e, this.f10978f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f10976c);
        StringBuilder q10 = j3.r0.q("AppParcelable{title='", this.f10975b, "', developerName='", this.d, "', formattedPrice='");
        q10.append(this.f10977e);
        q10.append("', starRating=");
        q10.append(this.f10978f);
        q10.append(", wearDetails=");
        j3.r0.A(q10, valueOf, ", deepLinkUri='", this.f10974a, "', icon=");
        return aa.d.r(q10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.f10974a);
        p8.l(parcel, 2, this.f10975b);
        p8.k(parcel, 3, this.f10976c, i9);
        p8.l(parcel, 4, this.d);
        p8.l(parcel, 5, this.f10977e);
        p8.e(parcel, 6, this.f10978f);
        p8.k(parcel, 7, this.h, i9);
        p8.r(parcel, q10);
    }
}
