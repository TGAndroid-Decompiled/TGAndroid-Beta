package b9;

import a8.h7;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class d1 extends r6.a {
    public static final Parcelable.Creator<d1> CREATOR = new o0(10);
    public final String f2987a;
    public final String f2988b;
    public final b1 f2989c;
    public final String d;
    public final String f2990e;
    public final Float f2991f;
    public final f1 h;

    public d1(String str, String str2, b1 b1Var, String str3, String str4, Float f10, f1 f1Var) {
        this.f2987a = str;
        this.f2988b = str2;
        this.f2989c = b1Var;
        this.d = str3;
        this.f2990e = str4;
        this.f2991f = f10;
        this.h = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (h7.a(this.f2987a, d1Var.f2987a) && h7.a(this.f2988b, d1Var.f2988b) && h7.a(this.f2989c, d1Var.f2989c) && h7.a(this.d, d1Var.d) && h7.a(this.f2990e, d1Var.f2990e) && h7.a(this.f2991f, d1Var.f2991f) && h7.a(this.h, d1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2987a, this.f2988b, this.f2989c, this.d, this.f2990e, this.f2991f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f2989c);
        StringBuilder n10 = e2.n("AppParcelable{title='", this.f2988b, "', developerName='", this.d, "', formattedPrice='");
        n10.append(this.f2990e);
        n10.append("', starRating=");
        n10.append(this.f2991f);
        n10.append(", wearDetails=");
        e2.r(n10, valueOf, ", deepLinkUri='", this.f2987a, "', icon=");
        return a8.p0.s(n10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f2987a);
        bc.l(parcel, 2, this.f2988b);
        bc.k(parcel, 3, this.f2989c, i7);
        bc.l(parcel, 4, this.d);
        bc.l(parcel, 5, this.f2990e);
        bc.e(parcel, 6, this.f2991f);
        bc.k(parcel, 7, this.h, i7);
        bc.s(parcel, r10);
    }
}
