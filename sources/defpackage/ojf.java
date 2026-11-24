package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
public final class ojf extends b4 {
    public static final Parcelable.Creator<ojf> CREATOR = new yhf((byte) 14);
    public final wje a;
    public final long b;
    public final int c;
    public final String d;
    public final y7e e;
    public final boolean f;
    public final int h;
    public final int n;
    public final String r;

    public ojf(wje wjeVar, long j, int i, String str, y7e y7eVar, boolean z, int i2, int i3, String str2) {
        this.a = wjeVar;
        this.b = j;
        this.c = i;
        this.d = str;
        this.e = y7eVar;
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
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.q(parcel, 2, 8);
        parcel.writeLong(this.b);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        mve.l(parcel, 4, this.d);
        mve.k(parcel, 5, this.e, i);
        mve.q(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        mve.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        mve.q(parcel, 8, 4);
        parcel.writeInt(this.n);
        mve.l(parcel, 9, this.r);
        mve.s(parcel, r);
    }
}
