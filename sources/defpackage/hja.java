package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class hja extends b4 {
    public static final Parcelable.Creator<hja> CREATOR = new d3d((byte) 24);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String h;
    public final String n;
    public final lw8 r;

    public hja(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, lw8 lw8Var) {
        ite.h(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.h = str6;
        this.n = str7;
        this.r = lw8Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hja)) {
            return false;
        }
        hja hjaVar = (hja) obj;
        if (!fse.a(this.a, hjaVar.a) || !fse.a(this.b, hjaVar.b) || !fse.a(this.c, hjaVar.c) || !fse.a(this.d, hjaVar.d) || !fse.a(this.e, hjaVar.e) || !fse.a(this.f, hjaVar.f) || !fse.a(this.h, hjaVar.h) || !fse.a(this.n, hjaVar.n) || !fse.a(this.r, hjaVar.r)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.l(parcel, 2, this.b);
        mve.l(parcel, 3, this.c);
        mve.l(parcel, 4, this.d);
        mve.k(parcel, 5, this.e, i);
        mve.l(parcel, 6, this.f);
        mve.l(parcel, 7, this.h);
        mve.l(parcel, 8, this.n);
        mve.k(parcel, 9, this.r, i);
        mve.s(parcel, r);
    }
}
