package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
import org.telegram.ui.yh;
public final class d1 extends c6.a {
    public static final Parcelable.Creator<d1> CREATOR = new o0(10);
    public final String f13510a;
    public final String f13511b;
    public final b1 f13512c;
    public final String d;
    public final String f13513e;
    public final Float f13514f;
    public final f1 h;

    public d1(String str, String str2, b1 b1Var, String str3, String str4, Float f10, f1 f1Var) {
        this.f13510a = str;
        this.f13511b = str2;
        this.f13512c = b1Var;
        this.d = str3;
        this.f13513e = str4;
        this.f13514f = f10;
        this.h = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d1.class == obj.getClass()) {
            d1 d1Var = (d1) obj;
            if (k7.q.a(this.f13510a, d1Var.f13510a) && k7.q.a(this.f13511b, d1Var.f13511b) && k7.q.a(this.f13512c, d1Var.f13512c) && k7.q.a(this.d, d1Var.d) && k7.q.a(this.f13513e, d1Var.f13513e) && k7.q.a(this.f13514f, d1Var.f13514f) && k7.q.a(this.h, d1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13510a, this.f13511b, this.f13512c, this.d, this.f13513e, this.f13514f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f13512c);
        StringBuilder m9 = yh.m("AppParcelable{title='", this.f13511b, "', developerName='", this.d, "', formattedPrice='");
        m9.append(this.f13513e);
        m9.append("', starRating=");
        m9.append(this.f13514f);
        m9.append(", wearDetails=");
        yh.w(m9, valueOf, ", deepLinkUri='", this.f13510a, "', icon=");
        return android.support.v4.media.a.r(m9, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.f13510a);
        g5.l(parcel, 2, this.f13511b);
        g5.k(parcel, 3, this.f13512c, i10);
        g5.l(parcel, 4, this.d);
        g5.l(parcel, 5, this.f13513e);
        g5.e(parcel, 6, this.f13514f);
        g5.k(parcel, 7, this.h, i10);
        g5.r(parcel, q10);
    }
}
