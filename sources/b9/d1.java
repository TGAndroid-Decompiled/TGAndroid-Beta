package b9;

import a8.h7;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
public final class d1 extends r6.a {
    public static final Parcelable.Creator<d1> CREATOR = new o0(10);
    public final String f2999a;
    public final String f3000b;
    public final b1 f3001c;
    public final String d;
    public final String f3002e;
    public final Float f3003f;
    public final f1 h;

    public d1(String str, String str2, b1 b1Var, String str3, String str4, Float f10, f1 f1Var) {
        this.f2999a = str;
        this.f3000b = str2;
        this.f3001c = b1Var;
        this.d = str3;
        this.f3002e = str4;
        this.f3003f = f10;
        this.h = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (h7.a(this.f2999a, d1Var.f2999a) && h7.a(this.f3000b, d1Var.f3000b) && h7.a(this.f3001c, d1Var.f3001c) && h7.a(this.d, d1Var.d) && h7.a(this.f3002e, d1Var.f3002e) && h7.a(this.f3003f, d1Var.f3003f) && h7.a(this.h, d1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2999a, this.f3000b, this.f3001c, this.d, this.f3002e, this.f3003f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f3001c);
        StringBuilder n10 = e2.n("AppParcelable{title='", this.f3000b, "', developerName='", this.d, "', formattedPrice='");
        n10.append(this.f3002e);
        n10.append("', starRating=");
        n10.append(this.f3003f);
        n10.append(", wearDetails=");
        e2.r(n10, valueOf, ", deepLinkUri='", this.f2999a, "', icon=");
        return a8.p0.s(n10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.f2999a);
        bc.l(parcel, 2, this.f3000b);
        bc.k(parcel, 3, this.f3001c, i7);
        bc.l(parcel, 4, this.d);
        bc.l(parcel, 5, this.f3002e);
        bc.e(parcel, 6, this.f3003f);
        bc.k(parcel, 7, this.h, i7);
        bc.s(parcel, r10);
    }
}
