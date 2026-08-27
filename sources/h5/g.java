package h5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import n6.u;
import y5.l;

public final class g extends z5.a {
    public static final Parcelable.Creator<g> CREATOR = new h(5);

    public final String f8280a;

    public final String f8281b;

    public final String f8282c;
    public final String d;

    public final Uri f8283e;

    public final String f8284f;
    public final String h;

    public final String f8285n;

    public final u f8286r;

    public g(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, u uVar) {
        l.h(str);
        this.f8280a = str;
        this.f8281b = str2;
        this.f8282c = str3;
        this.d = str4;
        this.f8283e = uri;
        this.f8284f = str5;
        this.h = str6;
        this.f8285n = str7;
        this.f8286r = uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.l(this.f8280a, gVar.f8280a) && l.l(this.f8281b, gVar.f8281b) && l.l(this.f8282c, gVar.f8282c) && l.l(this.d, gVar.d) && l.l(this.f8283e, gVar.f8283e) && l.l(this.f8284f, gVar.f8284f) && l.l(this.h, gVar.h) && l.l(this.f8285n, gVar.f8285n) && l.l(this.f8286r, gVar.f8286r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8280a, this.f8281b, this.f8282c, this.d, this.f8283e, this.f8284f, this.h, this.f8285n, this.f8286r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.f8280a);
        r8.l(parcel, 2, this.f8281b);
        r8.l(parcel, 3, this.f8282c);
        r8.l(parcel, 4, this.d);
        r8.k(parcel, 5, this.f8283e, i10);
        r8.l(parcel, 6, this.f8284f);
        r8.l(parcel, 7, this.h);
        r8.l(parcel, 8, this.f8285n);
        r8.k(parcel, 9, this.f8286r, i10);
        r8.r(parcel, iQ);
    }
}
