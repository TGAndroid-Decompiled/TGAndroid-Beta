package l5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.g5;
import java.util.Arrays;
import l4.j;
import q6.u;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new j(7);
    public final String f11728a;
    public final String f11729b;
    public final String f11730c;
    public final String d;
    public final Uri f11731e;
    public final String f11732f;
    public final String h;
    public final String f11733n;
    public final u f11734r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        m.h(str);
        this.f11728a = str;
        this.f11729b = str2;
        this.f11730c = str3;
        this.d = str4;
        this.f11731e = uri;
        this.f11732f = str5;
        this.h = str6;
        this.f11733n = str7;
        this.f11734r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!m.l(this.f11728a, gVar.f11728a) || !m.l(this.f11729b, gVar.f11729b) || !m.l(this.f11730c, gVar.f11730c) || !m.l(this.d, gVar.d) || !m.l(this.f11731e, gVar.f11731e) || !m.l(this.f11732f, gVar.f11732f) || !m.l(this.h, gVar.h) || !m.l(this.f11733n, gVar.f11733n) || !m.l(this.f11734r, gVar.f11734r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11728a, this.f11729b, this.f11730c, this.d, this.f11731e, this.f11732f, this.h, this.f11733n, this.f11734r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.f11728a);
        g5.l(parcel, 2, this.f11729b);
        g5.l(parcel, 3, this.f11730c);
        g5.l(parcel, 4, this.d);
        g5.k(parcel, 5, this.f11731e, i10);
        g5.l(parcel, 6, this.f11732f);
        g5.l(parcel, 7, this.h);
        g5.l(parcel, 8, this.f11733n);
        g5.k(parcel, 9, this.f11734r, i10);
        g5.r(parcel, q10);
    }
}
