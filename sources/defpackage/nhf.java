package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
public final class nhf extends b4 {
    public static final Parcelable.Creator<nhf> CREATOR = new xff((byte) 14);
    public final vhe a;
    public final long b;
    public final int c;
    public final String d;
    public final v5e e;
    public final boolean f;
    public final int h;
    public final int n;
    public final String r;

    public nhf(vhe vheVar, long j, int i, String str, v5e v5eVar, boolean z, int i2, int i3, String str2) {
        this.a = vheVar;
        this.b = j;
        this.c = i;
        this.d = str;
        this.e = v5eVar;
        this.f = z;
        this.h = i2;
        this.n = i3;
        this.r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.a + ", timestamp=" + this.b + ", usageType=" + this.c + ", status=" + this.n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 1, this.a, i);
        jte.q(parcel, 2, 8);
        parcel.writeLong(this.b);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        jte.l(parcel, 4, this.d);
        jte.k(parcel, 5, this.e, i);
        jte.q(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        jte.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        jte.q(parcel, 8, 4);
        parcel.writeInt(this.n);
        jte.l(parcel, 9, this.r);
        jte.s(parcel, r);
    }
}
