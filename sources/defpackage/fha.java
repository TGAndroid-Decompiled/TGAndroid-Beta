package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class fha extends b4 {
    public static final Parcelable.Creator<fha> CREATOR = new b1d((byte) 24);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String h;
    public final String n;
    public final ku8 r;

    public fha(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, ku8 ku8Var) {
        fre.h(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.h = str6;
        this.n = str7;
        this.r = ku8Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fha)) {
            return false;
        }
        fha fhaVar = (fha) obj;
        if (!cqe.a(this.a, fhaVar.a) || !cqe.a(this.b, fhaVar.b) || !cqe.a(this.c, fhaVar.c) || !cqe.a(this.d, fhaVar.d) || !cqe.a(this.e, fhaVar.e) || !cqe.a(this.f, fhaVar.f) || !cqe.a(this.h, fhaVar.h) || !cqe.a(this.n, fhaVar.n) || !cqe.a(this.r, fhaVar.r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.l(parcel, 2, this.b);
        jte.l(parcel, 3, this.c);
        jte.l(parcel, 4, this.d);
        jte.k(parcel, 5, this.e, i);
        jte.l(parcel, 6, this.f);
        jte.l(parcel, 7, this.h);
        jte.l(parcel, 8, this.n);
        jte.k(parcel, 9, this.r, i);
        jte.s(parcel, r);
    }
}
