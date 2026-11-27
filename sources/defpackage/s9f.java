package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class s9f extends c4 {
    public static final Parcelable.Creator<s9f> CREATOR = new t4f((byte) 14);
    public final String a;
    public final String b;
    public final qqe c;
    public final String d;
    public final String e;
    public final Float f;
    public final nhf h;

    public s9f(String str, String str2, qqe qqeVar, String str3, String str4, Float f, nhf nhfVar) {
        this.a = str;
        this.b = str2;
        this.c = qqeVar;
        this.d = str3;
        this.e = str4;
        this.f = f;
        this.h = nhfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s9f.class == obj.getClass()) {
            s9f s9fVar = (s9f) obj;
            if (j8f.a(this.a, s9fVar.a) && j8f.a(this.b, s9fVar.b) && j8f.a(this.c, s9fVar.c) && j8f.a(this.d, s9fVar.d) && j8f.a(this.e, s9fVar.e) && j8f.a(this.f, s9fVar.f) && j8f.a(this.h, s9fVar.h)) {
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
        StringBuilder l = xnb.l("AppParcelable{title='", this.b, "', developerName='", this.d, "', formattedPrice='");
        l.append(this.e);
        l.append("', starRating=");
        l.append(this.f);
        l.append(", wearDetails=");
        qu6.u(l, valueOf, ", deepLinkUri='", this.a, "', icon=");
        return c00.k(l, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.l(parcel, 2, this.b);
        bye.k(parcel, 3, this.c, i);
        bye.l(parcel, 4, this.d);
        bye.l(parcel, 5, this.e);
        bye.e(parcel, 6, this.f);
        bye.k(parcel, 7, this.h, i);
        bye.s(parcel, r);
    }
}
