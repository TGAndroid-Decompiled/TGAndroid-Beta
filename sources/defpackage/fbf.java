package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class fbf extends b4 {
    public static final Parcelable.Creator<fbf> CREATOR = new c0f((byte) 22);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String h;
    public final boolean n;
    public final int r;

    public fbf(String str, int i, int i2, String str2, h7e h7eVar) {
        fre.h(str);
        this.a = str;
        this.b = i;
        this.c = i2;
        this.h = str2;
        this.d = null;
        this.e = null;
        this.f = true;
        this.n = false;
        this.r = h7eVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fbf) {
            fbf fbfVar = (fbf) obj;
            if (cqe.a(this.a, fbfVar.a) && this.b == fbfVar.b && this.c == fbfVar.c && cqe.a(this.h, fbfVar.h) && cqe.a(this.d, fbfVar.d) && cqe.a(this.e, fbfVar.e) && this.f == fbfVar.f && this.n == fbfVar.n && this.r == fbfVar.r) {
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
        return de9.l(sb, this.r, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        jte.l(parcel, 5, this.d);
        jte.l(parcel, 6, this.e);
        jte.q(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        jte.l(parcel, 8, this.h);
        jte.q(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        jte.q(parcel, 10, 4);
        parcel.writeInt(this.r);
        jte.s(parcel, r);
    }

    public fbf(String str, int i, int i2, String str2, String str3, boolean z, String str4, boolean z2, int i3) {
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
