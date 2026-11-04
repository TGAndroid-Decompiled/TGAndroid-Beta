package a9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class c1 extends q6.a {
    public static final Parcelable.Creator<c1> CREATOR = new n0(10);
    public final String f178a;
    public final String f179b;
    public final a1 f180c;
    public final String d;
    public final String f181e;
    public final Float f182f;
    public final e1 h;

    public c1(String str, String str2, a1 a1Var, String str3, String str4, Float f10, e1 e1Var) {
        this.f178a = str;
        this.f179b = str2;
        this.f180c = a1Var;
        this.d = str3;
        this.f181e = str4;
        this.f182f = f10;
        this.h = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (a5.a.b(this.f178a, c1Var.f178a) && a5.a.b(this.f179b, c1Var.f179b) && a5.a.b(this.f180c, c1Var.f180c) && a5.a.b(this.d, c1Var.d) && a5.a.b(this.f181e, c1Var.f181e) && a5.a.b(this.f182f, c1Var.f182f) && a5.a.b(this.h, c1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f178a, this.f179b, this.f180c, this.d, this.f181e, this.f182f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f180c);
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("AppParcelable{title='", this.f179b, "', developerName='", this.d, "', formattedPrice='");
        n4.append(this.f181e);
        n4.append("', starRating=");
        n4.append(this.f182f);
        n4.append(", wearDetails=");
        com.google.android.recaptcha.internal.a.s(n4, valueOf, ", deepLinkUri='", this.f178a, "', icon=");
        return a1.g.s(n4, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 1, this.f178a);
        j8.a.m(parcel, 2, this.f179b);
        j8.a.l(parcel, 3, this.f180c, i3);
        j8.a.m(parcel, 4, this.d);
        j8.a.m(parcel, 5, this.f181e);
        j8.a.f(parcel, 6, this.f182f);
        j8.a.l(parcel, 7, this.h, i3);
        j8.a.t(parcel, s6);
    }
}
