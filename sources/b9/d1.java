package b9;

import a8.h7;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class d1 extends r6.a {
    public static final Parcelable.Creator<d1> CREATOR = new o0(10);
    public final String f2992a;
    public final String f2993b;
    public final b1 f2994c;
    public final String d;
    public final String f2995e;
    public final Float f2996f;
    public final f1 h;

    public d1(String str, String str2, b1 b1Var, String str3, String str4, Float f10, f1 f1Var) {
        this.f2992a = str;
        this.f2993b = str2;
        this.f2994c = b1Var;
        this.d = str3;
        this.f2995e = str4;
        this.f2996f = f10;
        this.h = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (h7.a(this.f2992a, d1Var.f2992a) && h7.a(this.f2993b, d1Var.f2993b) && h7.a(this.f2994c, d1Var.f2994c) && h7.a(this.d, d1Var.d) && h7.a(this.f2995e, d1Var.f2995e) && h7.a(this.f2996f, d1Var.f2996f) && h7.a(this.h, d1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2992a, this.f2993b, this.f2994c, this.d, this.f2995e, this.f2996f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f2994c);
        StringBuilder n10 = e2.n("AppParcelable{title='", this.f2993b, "', developerName='", this.d, "', formattedPrice='");
        n10.append(this.f2995e);
        n10.append("', starRating=");
        n10.append(this.f2996f);
        n10.append(", wearDetails=");
        e2.r(n10, valueOf, ", deepLinkUri='", this.f2992a, "', icon=");
        return a8.p0.s(n10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.f2992a);
        yb.l(parcel, 2, this.f2993b);
        yb.k(parcel, 3, this.f2994c, i7);
        yb.l(parcel, 4, this.d);
        yb.l(parcel, 5, this.f2995e);
        yb.e(parcel, 6, this.f2996f);
        yb.k(parcel, 7, this.h, i7);
        yb.s(parcel, r10);
    }
}
