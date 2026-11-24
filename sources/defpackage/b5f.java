package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b5f extends b4 {
    public static final Parcelable.Creator<b5f> CREATOR = new c0f((byte) 14);
    public final String a;
    public final String b;
    public final zle c;
    public final String d;
    public final String e;
    public final Float f;
    public final xcf h;

    public b5f(String str, String str2, zle zleVar, String str3, String str4, Float f, xcf xcfVar) {
        this.a = str;
        this.b = str2;
        this.c = zleVar;
        this.d = str3;
        this.e = str4;
        this.f = f;
        this.h = xcfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b5f.class == obj.getClass()) {
            b5f b5fVar = (b5f) obj;
            if (q3f.a(this.a, b5fVar.a) && q3f.a(this.b, b5fVar.b) && q3f.a(this.c, b5fVar.c) && q3f.a(this.d, b5fVar.d) && q3f.a(this.e, b5fVar.e) && q3f.a(this.f, b5fVar.f) && q3f.a(this.h, b5fVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder l = yjb.l("AppParcelable{title='", this.b, "', developerName='", this.d, "', formattedPrice='");
        l.append(this.e);
        l.append("', starRating=");
        l.append(this.f);
        l.append(", wearDetails=");
        ls6.u(l, valueOf, ", deepLinkUri='", this.a, "', icon=");
        return b00.j(l, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.l(parcel, 2, this.b);
        jte.k(parcel, 3, this.c, i);
        jte.l(parcel, 4, this.d);
        jte.l(parcel, 5, this.e);
        jte.e(parcel, 6, this.f);
        jte.k(parcel, 7, this.h, i);
        jte.s(parcel, r);
    }
}
