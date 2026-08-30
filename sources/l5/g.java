package l5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.f5;
import java.util.Arrays;
import l4.j;
import q6.u;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new j(7);
    public final String f11351a;
    public final String f11352b;
    public final String f11353c;
    public final String d;
    public final Uri e;
    public final String f11354f;
    public final String h;
    public final String f11355n;
    public final u f11356r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        m.h(str);
        this.f11351a = str;
        this.f11352b = str2;
        this.f11353c = str3;
        this.d = str4;
        this.e = uri;
        this.f11354f = str5;
        this.h = str6;
        this.f11355n = str7;
        this.f11356r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!m.l(this.f11351a, gVar.f11351a) || !m.l(this.f11352b, gVar.f11352b) || !m.l(this.f11353c, gVar.f11353c) || !m.l(this.d, gVar.d) || !m.l(this.e, gVar.e) || !m.l(this.f11354f, gVar.f11354f) || !m.l(this.h, gVar.h) || !m.l(this.f11355n, gVar.f11355n) || !m.l(this.f11356r, gVar.f11356r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11351a, this.f11352b, this.f11353c, this.d, this.e, this.f11354f, this.h, this.f11355n, this.f11356r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f11351a);
        f5.l(parcel, 2, this.f11352b);
        f5.l(parcel, 3, this.f11353c);
        f5.l(parcel, 4, this.d);
        f5.k(parcel, 5, this.e, i10);
        f5.l(parcel, 6, this.f11354f);
        f5.l(parcel, 7, this.h);
        f5.l(parcel, 8, this.f11355n);
        f5.k(parcel, 9, this.f11356r, i10);
        f5.r(parcel, q10);
    }
}
