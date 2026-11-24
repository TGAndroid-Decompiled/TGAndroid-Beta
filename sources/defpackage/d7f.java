package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class d7f extends b4 {
    public static final Parcelable.Creator<d7f> CREATOR = new e2f((byte) 14);
    public final String a;
    public final String b;
    public final boe c;
    public final String d;
    public final String e;
    public final Float f;
    public final yef h;

    public d7f(String str, String str2, boe boeVar, String str3, String str4, Float f, yef yefVar) {
        this.a = str;
        this.b = str2;
        this.c = boeVar;
        this.d = str3;
        this.e = str4;
        this.f = f;
        this.h = yefVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d7f.class == obj.getClass()) {
            d7f d7fVar = (d7f) obj;
            if (s5f.a(this.a, d7fVar.a) && s5f.a(this.b, d7fVar.b) && s5f.a(this.c, d7fVar.c) && s5f.a(this.d, d7fVar.d) && s5f.a(this.e, d7fVar.e) && s5f.a(this.f, d7fVar.f) && s5f.a(this.h, d7fVar.h)) {
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
        StringBuilder m = mlb.m("AppParcelable{title='", this.b, "', developerName='", this.d, "', formattedPrice='");
        m.append(this.e);
        m.append("', starRating=");
        m.append(this.f);
        m.append(", wearDetails=");
        kt6.v(m, valueOf, ", deepLinkUri='", this.a, "', icon=");
        return b10.j(m, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.l(parcel, 2, this.b);
        mve.k(parcel, 3, this.c, i);
        mve.l(parcel, 4, this.d);
        mve.l(parcel, 5, this.e);
        mve.e(parcel, 6, this.f);
        mve.k(parcel, 7, this.h, i);
        mve.s(parcel, r);
    }
}
