package a6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import f7.u;
import java.util.Arrays;
import q6.m;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new w.a(7);
    public final String f292a;
    public final String f293b;
    public final String f294c;
    public final String d;
    public final Uri f295e;
    public final String f296f;
    public final String h;
    public final String f297n;
    public final u f298r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        m.g(str);
        this.f292a = str;
        this.f293b = str2;
        this.f294c = str3;
        this.d = str4;
        this.f295e = uri;
        this.f296f = str5;
        this.h = str6;
        this.f297n = str7;
        this.f298r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!m.k(this.f292a, gVar.f292a) || !m.k(this.f293b, gVar.f293b) || !m.k(this.f294c, gVar.f294c) || !m.k(this.d, gVar.d) || !m.k(this.f295e, gVar.f295e) || !m.k(this.f296f, gVar.f296f) || !m.k(this.h, gVar.h) || !m.k(this.f297n, gVar.f297n) || !m.k(this.f298r, gVar.f298r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f292a, this.f293b, this.f294c, this.d, this.f295e, this.f296f, this.h, this.f297n, this.f298r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.f292a);
        xb.l(parcel, 2, this.f293b);
        xb.l(parcel, 3, this.f294c);
        xb.l(parcel, 4, this.d);
        xb.k(parcel, 5, this.f295e, i7);
        xb.l(parcel, 6, this.f296f);
        xb.l(parcel, 7, this.h);
        xb.l(parcel, 8, this.f297n);
        xb.k(parcel, 9, this.f298r, i7);
        xb.s(parcel, r10);
    }
}
