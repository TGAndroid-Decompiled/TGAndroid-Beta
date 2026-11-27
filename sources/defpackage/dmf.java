package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
public final class dmf extends c4 {
    public static final Parcelable.Creator<dmf> CREATOR = new nkf((byte) 14);
    public final mme a;
    public final long b;
    public final int c;
    public final String d;
    public final lae e;
    public final boolean f;
    public final int h;
    public final int n;
    public final String r;

    public dmf(mme mmeVar, long j, int i, String str, lae laeVar, boolean z, int i2, int i3, String str2) {
        this.a = mmeVar;
        this.b = j;
        this.c = i;
        this.d = str;
        this.e = laeVar;
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
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 1, this.a, i);
        bye.q(parcel, 2, 8);
        parcel.writeLong(this.b);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        bye.l(parcel, 4, this.d);
        bye.k(parcel, 5, this.e, i);
        bye.q(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        bye.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        bye.q(parcel, 8, 4);
        parcel.writeInt(this.n);
        bye.l(parcel, 9, this.r);
        bye.s(parcel, r);
    }
}
