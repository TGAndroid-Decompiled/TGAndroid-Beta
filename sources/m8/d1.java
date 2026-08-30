package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
import org.telegram.ui.yh;
public final class d1 extends c6.a {
    public static final Parcelable.Creator<d1> CREATOR = new o0(10);
    public final String f13795a;
    public final String f13796b;
    public final b1 f13797c;
    public final String d;
    public final String e;
    public final Float f13798f;
    public final f1 h;

    public d1(String str, String str2, b1 b1Var, String str3, String str4, Float f10, f1 f1Var) {
        this.f13795a = str;
        this.f13796b = str2;
        this.f13797c = b1Var;
        this.d = str3;
        this.e = str4;
        this.f13798f = f10;
        this.h = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (k7.p.a(this.f13795a, d1Var.f13795a) && k7.p.a(this.f13796b, d1Var.f13796b) && k7.p.a(this.f13797c, d1Var.f13797c) && k7.p.a(this.d, d1Var.d) && k7.p.a(this.e, d1Var.e) && k7.p.a(this.f13798f, d1Var.f13798f) && k7.p.a(this.h, d1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13795a, this.f13796b, this.f13797c, this.d, this.e, this.f13798f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f13797c);
        StringBuilder m9 = yh.m("AppParcelable{title='", this.f13796b, "', developerName='", this.d, "', formattedPrice='");
        m9.append(this.e);
        m9.append("', starRating=");
        m9.append(this.f13798f);
        m9.append(", wearDetails=");
        yh.x(m9, valueOf, ", deepLinkUri='", this.f13795a, "', icon=");
        return android.support.v4.media.a.r(m9, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f13795a);
        f5.l(parcel, 2, this.f13796b);
        f5.k(parcel, 3, this.f13797c, i10);
        f5.l(parcel, 4, this.d);
        f5.l(parcel, 5, this.e);
        f5.e(parcel, 6, this.f13798f);
        f5.k(parcel, 7, this.h, i10);
        f5.r(parcel, q10);
    }
}
