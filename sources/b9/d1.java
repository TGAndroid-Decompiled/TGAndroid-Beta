package b9;

import a8.h7;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class d1 extends r6.a {
    public static final Parcelable.Creator<d1> CREATOR = new o0(10);
    public final String f2989a;
    public final String f2990b;
    public final b1 f2991c;
    public final String d;
    public final String f2992e;
    public final Float f2993f;
    public final f1 h;

    public d1(String str, String str2, b1 b1Var, String str3, String str4, Float f10, f1 f1Var) {
        this.f2989a = str;
        this.f2990b = str2;
        this.f2991c = b1Var;
        this.d = str3;
        this.f2992e = str4;
        this.f2993f = f10;
        this.h = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (h7.a(this.f2989a, d1Var.f2989a) && h7.a(this.f2990b, d1Var.f2990b) && h7.a(this.f2991c, d1Var.f2991c) && h7.a(this.d, d1Var.d) && h7.a(this.f2992e, d1Var.f2992e) && h7.a(this.f2993f, d1Var.f2993f) && h7.a(this.h, d1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2989a, this.f2990b, this.f2991c, this.d, this.f2992e, this.f2993f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f2991c);
        StringBuilder n10 = e2.n("AppParcelable{title='", this.f2990b, "', developerName='", this.d, "', formattedPrice='");
        n10.append(this.f2992e);
        n10.append("', starRating=");
        n10.append(this.f2993f);
        n10.append(", wearDetails=");
        e2.r(n10, valueOf, ", deepLinkUri='", this.f2989a, "', icon=");
        return a8.p0.s(n10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.f2989a);
        yb.l(parcel, 2, this.f2990b);
        yb.k(parcel, 3, this.f2991c, i7);
        yb.l(parcel, 4, this.d);
        yb.l(parcel, 5, this.f2992e);
        yb.e(parcel, 6, this.f2993f);
        yb.k(parcel, 7, this.h, i7);
        yb.s(parcel, r10);
    }
}
