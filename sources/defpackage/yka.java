package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class yka extends c4 {
    public static final Parcelable.Creator<yka> CREATOR = new s5d((byte) 24);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String h;
    public final String n;
    public final tx8 r;

    public yka(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, tx8 tx8Var) {
        xve.h(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.h = str6;
        this.n = str7;
        this.r = tx8Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yka)) {
            return false;
        }
        yka ykaVar = (yka) obj;
        if (!vue.a(this.a, ykaVar.a) || !vue.a(this.b, ykaVar.b) || !vue.a(this.c, ykaVar.c) || !vue.a(this.d, ykaVar.d) || !vue.a(this.e, ykaVar.e) || !vue.a(this.f, ykaVar.f) || !vue.a(this.h, ykaVar.h) || !vue.a(this.n, ykaVar.n) || !vue.a(this.r, ykaVar.r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.l(parcel, 2, this.b);
        bye.l(parcel, 3, this.c);
        bye.l(parcel, 4, this.d);
        bye.k(parcel, 5, this.e, i);
        bye.l(parcel, 6, this.f);
        bye.l(parcel, 7, this.h);
        bye.l(parcel, 8, this.n);
        bye.k(parcel, 9, this.r, i);
        bye.s(parcel, r);
    }
}
