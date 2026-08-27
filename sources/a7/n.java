package a7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Locale;

public final class n extends z5.a {
    public static final Parcelable.Creator<n> CREATOR = new w.a(9);

    public final g f132a;

    public final long f133b;

    public final int f134c;
    public final String d;

    public final f f135e;

    public final boolean f136f;
    public final int h;

    public final int f137n;

    public final String f138r;

    public n(g gVar, long j10, int i10, String str, f fVar, boolean z10, int i11, int i12, String str2) {
        this.f132a = gVar;
        this.f133b = j10;
        this.f134c = i10;
        this.d = str;
        this.f135e = fVar;
        this.f136f = z10;
        this.h = i11;
        this.f137n = i12;
        this.f138r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f132a + ", timestamp=" + this.f133b + ", usageType=" + this.f134c + ", status=" + this.f137n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.f132a, i10);
        r8.s(parcel, 2, 8);
        parcel.writeLong(this.f133b);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f134c);
        r8.l(parcel, 4, this.d);
        r8.k(parcel, 5, this.f135e, i10);
        r8.s(parcel, 6, 4);
        parcel.writeInt(this.f136f ? 1 : 0);
        r8.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        r8.s(parcel, 8, 4);
        parcel.writeInt(this.f137n);
        r8.l(parcel, 9, this.f138r);
        r8.r(parcel, iQ);
    }
}
