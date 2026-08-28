package h5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import m6.u;
import x5.l;
public final class g extends y5.a {
    public static final Parcelable.Creator<g> CREATOR = new h(6);
    public final String f9850a;
    public final String f9851b;
    public final String f9852c;
    public final String d;
    public final Uri f9853e;
    public final String f9854f;
    public final String h;
    public final String f9855n;
    public final u f9856r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f9850a = str;
        this.f9851b = str2;
        this.f9852c = str3;
        this.d = str4;
        this.f9853e = uri;
        this.f9854f = str5;
        this.h = str6;
        this.f9855n = str7;
        this.f9856r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f9850a, gVar.f9850a) || !l.l(this.f9851b, gVar.f9851b) || !l.l(this.f9852c, gVar.f9852c) || !l.l(this.d, gVar.d) || !l.l(this.f9853e, gVar.f9853e) || !l.l(this.f9854f, gVar.f9854f) || !l.l(this.h, gVar.h) || !l.l(this.f9855n, gVar.f9855n) || !l.l(this.f9856r, gVar.f9856r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9850a, this.f9851b, this.f9852c, this.d, this.f9853e, this.f9854f, this.h, this.f9855n, this.f9856r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 1, this.f9850a);
        p8.l(parcel, 2, this.f9851b);
        p8.l(parcel, 3, this.f9852c);
        p8.l(parcel, 4, this.d);
        p8.k(parcel, 5, this.f9853e, i9);
        p8.l(parcel, 6, this.f9854f);
        p8.l(parcel, 7, this.h);
        p8.l(parcel, 8, this.f9855n);
        p8.k(parcel, 9, this.f9856r, i9);
        p8.r(parcel, q10);
    }
}
