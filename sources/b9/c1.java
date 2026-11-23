package b9;

import a8.i7;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class c1 extends r6.a {
    public static final Parcelable.Creator<c1> CREATOR = new n0(10);
    public final String f2954a;
    public final String f2955b;
    public final a1 f2956c;
    public final String d;
    public final String f2957e;
    public final Float f2958f;
    public final e1 h;

    public c1(String str, String str2, a1 a1Var, String str3, String str4, Float f10, e1 e1Var) {
        this.f2954a = str;
        this.f2955b = str2;
        this.f2956c = a1Var;
        this.d = str3;
        this.f2957e = str4;
        this.f2958f = f10;
        this.h = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (i7.a(this.f2954a, c1Var.f2954a) && i7.a(this.f2955b, c1Var.f2955b) && i7.a(this.f2956c, c1Var.f2956c) && i7.a(this.d, c1Var.d) && i7.a(this.f2957e, c1Var.f2957e) && i7.a(this.f2958f, c1Var.f2958f) && i7.a(this.h, c1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2954a, this.f2955b, this.f2956c, this.d, this.f2957e, this.f2958f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f2956c);
        StringBuilder n10 = e2.n("AppParcelable{title='", this.f2955b, "', developerName='", this.d, "', formattedPrice='");
        n10.append(this.f2957e);
        n10.append("', starRating=");
        n10.append(this.f2958f);
        n10.append(", wearDetails=");
        e2.r(n10, valueOf, ", deepLinkUri='", this.f2954a, "', icon=");
        return a8.p0.s(n10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.f2954a);
        cc.l(parcel, 2, this.f2955b);
        cc.k(parcel, 3, this.f2956c, i7);
        cc.l(parcel, 4, this.d);
        cc.l(parcel, 5, this.f2957e);
        cc.e(parcel, 6, this.f2958f);
        cc.k(parcel, 7, this.h, i7);
        cc.s(parcel, r10);
    }
}
