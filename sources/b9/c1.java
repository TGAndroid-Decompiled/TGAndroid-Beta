package b9;

import a8.g7;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
public final class c1 extends r6.a {
    public static final Parcelable.Creator<c1> CREATOR = new n0(10);
    public final String f3031a;
    public final String f3032b;
    public final a1 f3033c;
    public final String d;
    public final String f3034e;
    public final Float f3035f;
    public final e1 h;

    public c1(String str, String str2, a1 a1Var, String str3, String str4, Float f10, e1 e1Var) {
        this.f3031a = str;
        this.f3032b = str2;
        this.f3033c = a1Var;
        this.d = str3;
        this.f3034e = str4;
        this.f3035f = f10;
        this.h = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (g7.a(this.f3031a, c1Var.f3031a) && g7.a(this.f3032b, c1Var.f3032b) && g7.a(this.f3033c, c1Var.f3033c) && g7.a(this.d, c1Var.d) && g7.a(this.f3034e, c1Var.f3034e) && g7.a(this.f3035f, c1Var.f3035f) && g7.a(this.h, c1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3031a, this.f3032b, this.f3033c, this.d, this.f3034e, this.f3035f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f3033c);
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("AppParcelable{title='", this.f3032b, "', developerName='", this.d, "', formattedPrice='");
        n10.append(this.f3034e);
        n10.append("', starRating=");
        n10.append(this.f3035f);
        n10.append(", wearDetails=");
        com.google.android.recaptcha.internal.a.s(n10, valueOf, ", deepLinkUri='", this.f3031a, "', icon=");
        return a8.p0.s(n10, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f3031a);
        xb.l(parcel, 2, this.f3032b);
        xb.k(parcel, 3, this.f3033c, i7);
        xb.l(parcel, 4, this.d);
        xb.l(parcel, 5, this.f3034e);
        xb.e(parcel, 6, this.f3035f);
        xb.k(parcel, 7, this.h, i7);
        xb.s(parcel, r10);
    }
}
