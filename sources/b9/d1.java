package b9;

import a8.i7;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class d1 extends r6.a {
    public static final Parcelable.Creator<d1> CREATOR = new o0(10);
    public final String f2957a;
    public final String f2958b;
    public final b1 f2959c;
    public final String d;
    public final String f2960e;
    public final Float f2961f;
    public final f1 h;

    public d1(String str, String str2, b1 b1Var, String str3, String str4, Float f10, f1 f1Var) {
        this.f2957a = str;
        this.f2958b = str2;
        this.f2959c = b1Var;
        this.d = str3;
        this.f2960e = str4;
        this.f2961f = f10;
        this.h = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (i7.a(this.f2957a, d1Var.f2957a) && i7.a(this.f2958b, d1Var.f2958b) && i7.a(this.f2959c, d1Var.f2959c) && i7.a(this.d, d1Var.d) && i7.a(this.f2960e, d1Var.f2960e) && i7.a(this.f2961f, d1Var.f2961f) && i7.a(this.h, d1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2957a, this.f2958b, this.f2959c, this.d, this.f2960e, this.f2961f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f2959c);
        StringBuilder n10 = e2.n("AppParcelable{title='", this.f2958b, "', developerName='", this.d, "', formattedPrice='");
        n10.append(this.f2960e);
        n10.append("', starRating=");
        n10.append(this.f2961f);
        n10.append(", wearDetails=");
        e2.r(n10, valueOf, ", deepLinkUri='", this.f2957a, "', icon=");
        return a8.p0.s(n10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.f2957a);
        cc.l(parcel, 2, this.f2958b);
        cc.k(parcel, 3, this.f2959c, i7);
        cc.l(parcel, 4, this.d);
        cc.l(parcel, 5, this.f2960e);
        cc.e(parcel, 6, this.f2961f);
        cc.k(parcel, 7, this.h, i7);
        cc.s(parcel, r10);
    }
}
