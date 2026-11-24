package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class gdf extends b4 {
    public static final Parcelable.Creator<gdf> CREATOR = new e2f((byte) 22);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String h;
    public final boolean n;
    public final int r;

    public gdf(String str, int i, int i2, String str2, i9e i9eVar) {
        ite.h(str);
        this.a = str;
        this.b = i;
        this.c = i2;
        this.h = str2;
        this.d = null;
        this.e = null;
        this.f = true;
        this.n = false;
        this.r = i9eVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gdf) {
            gdf gdfVar = (gdf) obj;
            if (fse.a(this.a, gdfVar.a) && this.b == gdfVar.b && this.c == gdfVar.c && fse.a(this.h, gdfVar.h) && fse.a(this.d, gdfVar.d) && fse.a(this.e, gdfVar.e) && this.f == gdfVar.f && this.n == gdfVar.n && this.r == gdfVar.r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.h, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.n), Integer.valueOf(this.r)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayLoggerContext[package=");
        sb.append(this.a);
        sb.append(",packageVersionCode=");
        sb.append(this.b);
        sb.append(",logSource=");
        sb.append(this.c);
        sb.append(",logSourceName=");
        sb.append(this.h);
        sb.append(",uploadAccount=");
        sb.append(this.d);
        sb.append(",loggingId=");
        sb.append(this.e);
        sb.append(",logAndroidId=");
        sb.append(this.f);
        sb.append(",isAnonymous=");
        sb.append(this.n);
        sb.append(",qosTier=");
        return hg9.k(sb, this.r, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        mve.l(parcel, 5, this.d);
        mve.l(parcel, 6, this.e);
        mve.q(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        mve.l(parcel, 8, this.h);
        mve.q(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        mve.q(parcel, 10, 4);
        parcel.writeInt(this.r);
        mve.s(parcel, r);
    }

    public gdf(String str, int i, int i2, String str2, String str3, boolean z, String str4, boolean z2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.h = str4;
        this.n = z2;
        this.r = i3;
    }
}
