package j5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Arrays;
import o6.u;
import z5.l;
public final class g extends a6.a {
    public static final Parcelable.Creator<g> CREATOR = new i4.g(18);
    public final String f10887a;
    public final String f10888b;
    public final String f10889c;
    public final String d;
    public final Uri f10890e;
    public final String f10891f;
    public final String h;
    public final String f10892n;
    public final u f10893r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f10887a = str;
        this.f10888b = str2;
        this.f10889c = str3;
        this.d = str4;
        this.f10890e = uri;
        this.f10891f = str5;
        this.h = str6;
        this.f10892n = str7;
        this.f10893r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!l.l(this.f10887a, gVar.f10887a) || !l.l(this.f10888b, gVar.f10888b) || !l.l(this.f10889c, gVar.f10889c) || !l.l(this.d, gVar.d) || !l.l(this.f10890e, gVar.f10890e) || !l.l(this.f10891f, gVar.f10891f) || !l.l(this.h, gVar.h) || !l.l(this.f10892n, gVar.f10892n) || !l.l(this.f10893r, gVar.f10893r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10887a, this.f10888b, this.f10889c, this.d, this.f10890e, this.f10891f, this.h, this.f10892n, this.f10893r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 1, this.f10887a);
        o.l(parcel, 2, this.f10888b);
        o.l(parcel, 3, this.f10889c);
        o.l(parcel, 4, this.d);
        o.k(parcel, 5, this.f10890e, i10);
        o.l(parcel, 6, this.f10891f);
        o.l(parcel, 7, this.h);
        o.l(parcel, 8, this.f10892n);
        o.k(parcel, 9, this.f10893r, i10);
        o.r(parcel, q6);
    }
}
