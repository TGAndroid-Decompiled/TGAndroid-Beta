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
    public final String f11461a;
    public final String f11462b;
    public final String f11463c;
    public final String d;
    public final Uri e;
    public final String f11464f;
    public final String h;
    public final String f11465n;
    public final u f11466r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        m.h(str);
        this.f11461a = str;
        this.f11462b = str2;
        this.f11463c = str3;
        this.d = str4;
        this.e = uri;
        this.f11464f = str5;
        this.h = str6;
        this.f11465n = str7;
        this.f11466r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!m.l(this.f11461a, gVar.f11461a) || !m.l(this.f11462b, gVar.f11462b) || !m.l(this.f11463c, gVar.f11463c) || !m.l(this.d, gVar.d) || !m.l(this.e, gVar.e) || !m.l(this.f11464f, gVar.f11464f) || !m.l(this.h, gVar.h) || !m.l(this.f11465n, gVar.f11465n) || !m.l(this.f11466r, gVar.f11466r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11461a, this.f11462b, this.f11463c, this.d, this.e, this.f11464f, this.h, this.f11465n, this.f11466r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.f11461a);
        f5.l(parcel, 2, this.f11462b);
        f5.l(parcel, 3, this.f11463c);
        f5.l(parcel, 4, this.d);
        f5.k(parcel, 5, this.e, i10);
        f5.l(parcel, 6, this.f11464f);
        f5.l(parcel, 7, this.h);
        f5.l(parcel, 8, this.f11465n);
        f5.k(parcel, 9, this.f11466r, i10);
        f5.r(parcel, q10);
    }
}
